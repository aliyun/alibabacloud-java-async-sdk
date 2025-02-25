// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link ListTLSCipherPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTLSCipherPoliciesResponseBody</p>
 */
public class ListTLSCipherPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TLSCipherPolicies")
    private java.util.List<TLSCipherPolicies> TLSCipherPolicies;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTLSCipherPoliciesResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.TLSCipherPolicies = builder.TLSCipherPolicies;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTLSCipherPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
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
     * @return TLSCipherPolicies
     */
    public java.util.List<TLSCipherPolicies> getTLSCipherPolicies() {
        return this.TLSCipherPolicies;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<TLSCipherPolicies> TLSCipherPolicies; 
        private Integer totalCount; 

        /**
         * <p>Indicates whether the current page is the last page. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The current page is the last page.</li>
         * <li><strong>false</strong>: The current page is not the last page.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, it indicates that no next query is to be sent.</li>
         * <li>If <strong>NextToken</strong> is not empty, the value indicates the token that is used for the next query.</li>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of TLS policies.</p>
         */
        public Builder TLSCipherPolicies(java.util.List<TLSCipherPolicies> TLSCipherPolicies) {
            this.TLSCipherPolicies = TLSCipherPolicies;
            return this;
        }

        /**
         * <p>The total number of TLS policies returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTLSCipherPoliciesResponseBody build() {
            return new ListTLSCipherPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTLSCipherPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTLSCipherPoliciesResponseBody</p>
     */
    public static class RelateListeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private RelateListeners(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelateListeners create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private Integer port; 
            private String protocol; 

            /**
             * <p>The ID of the CLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-bp1b6c719dfa08ex****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The listening port. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The listening protocol. Valid values:</p>
             * <ul>
             * <li><strong>TCP</strong></li>
             * <li><strong>UDP</strong></li>
             * <li><strong>HTTP</strong></li>
             * <li><strong>HTTPS</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTPS</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public RelateListeners build() {
                return new RelateListeners(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTLSCipherPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTLSCipherPoliciesResponseBody</p>
     */
    public static class TLSCipherPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ciphers")
        private java.util.List<String> ciphers;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RelateListeners")
        private java.util.List<RelateListeners> relateListeners;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TLSVersions")
        private java.util.List<String> TLSVersions;

        private TLSCipherPolicies(Builder builder) {
            this.ciphers = builder.ciphers;
            this.createTime = builder.createTime;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.relateListeners = builder.relateListeners;
            this.status = builder.status;
            this.TLSVersions = builder.TLSVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TLSCipherPolicies create() {
            return builder().build();
        }

        /**
         * @return ciphers
         */
        public java.util.List<String> getCiphers() {
            return this.ciphers;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return relateListeners
         */
        public java.util.List<RelateListeners> getRelateListeners() {
            return this.relateListeners;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return TLSVersions
         */
        public java.util.List<String> getTLSVersions() {
            return this.TLSVersions;
        }

        public static final class Builder {
            private java.util.List<String> ciphers; 
            private Long createTime; 
            private String instanceId; 
            private String name; 
            private java.util.List<RelateListeners> relateListeners; 
            private String status; 
            private java.util.List<String> TLSVersions; 

            /**
             * <p>The cipher suites supported by the TLS version.</p>
             * <p>TLS 1.0 and TLS 1.1 support the following cipher suites:</p>
             * <ul>
             * <li>ECDHE-ECDSA-AES128-SHA</li>
             * <li>ECDHE-ECDSA-AES256-SHA</li>
             * <li>ECDHE-RSA-AES128-SHA</li>
             * <li>ECDHE-RSA-AES256-SHA</li>
             * <li>AES128-SHA AES256-SHA</li>
             * <li>DES-CBC3-SHA</li>
             * </ul>
             * <p>TLS 1.2 supports the following cipher suites:</p>
             * <ul>
             * <li>ECDHE-ECDSA-AES128-SHA</li>
             * <li>ECDHE-ECDSA-AES256-SHA</li>
             * <li>ECDHE-RSA-AES128-SHA</li>
             * <li>ECDHE-RSA-AES256-SHA</li>
             * <li>AES128-SHA AES256-SHA</li>
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
             * <li>AES128-SHA256 AES256-SHA256</li>
             * </ul>
             * <p>TLS 1.3 supports the following cipher suites:</p>
             * <ul>
             * <li>TLS_AES_128_GCM_SHA256</li>
             * <li>TLS_AES_256_GCM_SHA384</li>
             * <li>TLS_CHACHA20_POLY1305_SHA256</li>
             * <li>TLS_AES_128_CCM_SHA256</li>
             * <li>TLS_AES_128_CCM_8_SHA256</li>
             * </ul>
             */
            public Builder ciphers(java.util.List<String> ciphers) {
                this.ciphers = ciphers;
                return this;
            }

            /**
             * <p>The timestamp generated when the TLS policy is created.</p>
             * 
             * <strong>example:</strong>
             * <p>1608273800000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the TLS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>tls-bp17elso1h323r****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the TLS policy.</p>
             * 
             * <strong>example:</strong>
             * <p>TLSPolicy-test****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of associated listeners.</p>
             */
            public Builder relateListeners(java.util.List<RelateListeners> relateListeners) {
                this.relateListeners = relateListeners;
                return this;
            }

            /**
             * <p>The status of the TLS policy. Valid values:</p>
             * <ul>
             * <li><strong>configuring</strong>: The TLS policy is being configured.</li>
             * <li><strong>normal</strong>: The TLS policy works as expected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The version of the TLS protocol.</p>
             */
            public Builder TLSVersions(java.util.List<String> TLSVersions) {
                this.TLSVersions = TLSVersions;
                return this;
            }

            public TLSCipherPolicies build() {
                return new TLSCipherPolicies(this);
            } 

        } 

    }
}
