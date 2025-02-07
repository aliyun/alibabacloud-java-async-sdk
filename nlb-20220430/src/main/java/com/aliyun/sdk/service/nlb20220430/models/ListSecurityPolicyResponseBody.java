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
    private java.util.List<SecurityPolicies> securityPolicies;

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
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<SecurityPolicies> securityPolicies; 
        private Integer totalCount; 

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If NextToken is empty, no next page exists.</li>
         * <li>If a value is returned for NextToken, specify the value in the next request to retrieve a new page of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7A8875F-373A-5F48-8484-25B07A61F2AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The TLS security policies.</p>
         */
        public Builder securityPolicies(java.util.List<SecurityPolicies> securityPolicies) {
            this.securityPolicies = securityPolicies;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSecurityPolicyResponseBody build() {
            return new ListSecurityPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSecurityPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityPolicyResponseBody</p>
     */
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
             * <p>The listener ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lsn-bp1bpn0kn908w4nbw****@443</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The listener port.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder listenerPort(Long listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * <p>The listener protocol. Valid value: <strong>TCPSSL</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>TCPSSL</p>
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * <p>The NLB instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>nlb-83ckzc8d4xlp8o****</p>
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
    /**
     * 
     * {@link ListSecurityPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityPolicyResponseBody</p>
     */
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
             * <p>The tag key. You can specify up to 10 tag keys.</p>
             * <p>The tag key can be up to 64 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. You can specify up to 10 tag values.</p>
             * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
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
    /**
     * 
     * {@link ListSecurityPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityPolicyResponseBody</p>
     */
    public static class SecurityPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ciphers")
        private String ciphers;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RelatedListeners")
        private java.util.List<RelatedListeners> relatedListeners;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyName")
        private String securityPolicyName;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyStatus")
        private String securityPolicyStatus;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

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
        public java.util.List<RelatedListeners> getRelatedListeners() {
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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<RelatedListeners> relatedListeners; 
            private String resourceGroupId; 
            private String securityPolicyId; 
            private String securityPolicyName; 
            private String securityPolicyStatus; 
            private java.util.List<Tags> tags; 
            private String tlsVersion; 

            /**
             * <p>The supported cipher suites, which are determined by the TLS protocol version. You can specify at most 32 cipher suites.</p>
             * <p>TLS 1.0 and TLS 1.1 support the following cipher suites:</p>
             * <ul>
             * <li><strong>ECDHE-ECDSA-AES128-SHA</strong></li>
             * <li><strong>ECDHE-ECDSA-AES256-SHA</strong></li>
             * <li><strong>ECDHE-RSA-AES128-SHA</strong></li>
             * <li><strong>ECDHE-RSA-AES256-SHA</strong></li>
             * <li><strong>AES128-SHA</strong></li>
             * <li><strong>AES256-SHA</strong></li>
             * <li><strong>DES-CBC3-SHA</strong></li>
             * </ul>
             * <p>TLS 1.2 supports the following cipher suites:</p>
             * <ul>
             * <li><strong>ECDHE-ECDSA-AES128-SHA</strong></li>
             * <li><strong>ECDHE-ECDSA-AES256-SHA</strong></li>
             * <li><strong>ECDHE-RSA-AES128-SHA</strong></li>
             * <li><strong>ECDHE-RSA-AES256-SHA</strong></li>
             * <li><strong>AES128-SHA</strong></li>
             * <li><strong>AES256-SHA</strong></li>
             * <li><strong>DES-CBC3-SHA</strong></li>
             * <li><strong>ECDHE-ECDSA-AES128-GCM-SHA256</strong></li>
             * <li><strong>ECDHE-ECDSA-AES256-GCM-SHA384</strong></li>
             * <li><strong>ECDHE-ECDSA-AES128-SHA256</strong></li>
             * <li><strong>ECDHE-ECDSA-AES256-SHA384</strong></li>
             * <li><strong>ECDHE-RSA-AES128-GCM-SHA256</strong></li>
             * <li><strong>ECDHE-RSA-AES256-GCM-SHA384</strong></li>
             * <li><strong>ECDHE-RSA-AES128-SHA256</strong></li>
             * <li><strong>ECDHE-RSA-AES256-SHA384</strong></li>
             * <li><strong>AES128-GCM-SHA256</strong></li>
             * <li><strong>AES256-GCM-SHA384</strong></li>
             * <li><strong>AES128-SHA256</strong></li>
             * <li><strong>AES256-SHA256</strong></li>
             * </ul>
             * <p>TLS 1.3 supports the following cipher suites:</p>
             * <ul>
             * <li><strong>TLS_AES_128_GCM_SHA256</strong></li>
             * <li><strong>TLS_AES_256_GCM_SHA384</strong></li>
             * <li><strong>TLS_CHACHA20_POLY1305_SHA256</strong></li>
             * <li><strong>TLS_AES_128_CCM_SHA256</strong></li>
             * <li><strong>TLS_AES_128_CCM_8_SHA256</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECDHE-ECDSA-AES128-SHA</p>
             */
            public Builder ciphers(String ciphers) {
                this.ciphers = ciphers;
                return this;
            }

            /**
             * <p>The region ID of the NLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The listeners that are associated with the NLB instance.</p>
             */
            public Builder relatedListeners(java.util.List<RelatedListeners> relatedListeners) {
                this.relatedListeners = relatedListeners;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-atstuj3rtop****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the TLS security policy.</p>
             * 
             * <strong>example:</strong>
             * <p>tls-bp14bb1e7dll4f****</p>
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * <p>The name of the TLS security policy.</p>
             * 
             * <strong>example:</strong>
             * <p>TLSCipherPolicy</p>
             */
            public Builder securityPolicyName(String securityPolicyName) {
                this.securityPolicyName = securityPolicyName;
                return this;
            }

            /**
             * <p>The status of the TLS security policy. Valid values:</p>
             * <ul>
             * <li><strong>Configuring</strong></li>
             * <li><strong>Available</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder securityPolicyStatus(String securityPolicyStatus) {
                this.securityPolicyStatus = securityPolicyStatus;
                return this;
            }

            /**
             * <p>The tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The supported versions of the TLS protocol. Valid values: <strong>TLSv1.0</strong>, <strong>TLSv1.1</strong>, <strong>TLSv1.2</strong>, and <strong>TLSv1.3</strong>.</p>
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
