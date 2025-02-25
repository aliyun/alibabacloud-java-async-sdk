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
 * {@link ListListenersResponseBody} extends {@link TeaModel}
 *
 * <p>ListListenersResponseBody</p>
 */
public class ListListenersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Listeners")
    private java.util.List<Listeners> listeners;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListListenersResponseBody(Builder builder) {
        this.listeners = builder.listeners;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListListenersResponseBody create() {
        return builder().build();
    }

    /**
     * @return listeners
     */
    public java.util.List<Listeners> getListeners() {
        return this.listeners;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Listeners> listeners; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The listeners.</p>
         */
        public Builder listeners(java.util.List<Listeners> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, it indicates that no next query is to be sent.</li>
         * <li>If a value of <strong>NextToken</strong> is returned, the value is the token used for the next query.</li>
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
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListListenersResponseBody build() {
            return new ListListenersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
     */
    public static class ProxyProtocolV2Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ppv2PrivateLinkEpIdEnabled")
        private Boolean ppv2PrivateLinkEpIdEnabled;

        @com.aliyun.core.annotation.NameInMap("Ppv2PrivateLinkEpsIdEnabled")
        private Boolean ppv2PrivateLinkEpsIdEnabled;

        @com.aliyun.core.annotation.NameInMap("Ppv2VpcIdEnabled")
        private Boolean ppv2VpcIdEnabled;

        private ProxyProtocolV2Config(Builder builder) {
            this.ppv2PrivateLinkEpIdEnabled = builder.ppv2PrivateLinkEpIdEnabled;
            this.ppv2PrivateLinkEpsIdEnabled = builder.ppv2PrivateLinkEpsIdEnabled;
            this.ppv2VpcIdEnabled = builder.ppv2VpcIdEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProxyProtocolV2Config create() {
            return builder().build();
        }

        /**
         * @return ppv2PrivateLinkEpIdEnabled
         */
        public Boolean getPpv2PrivateLinkEpIdEnabled() {
            return this.ppv2PrivateLinkEpIdEnabled;
        }

        /**
         * @return ppv2PrivateLinkEpsIdEnabled
         */
        public Boolean getPpv2PrivateLinkEpsIdEnabled() {
            return this.ppv2PrivateLinkEpsIdEnabled;
        }

        /**
         * @return ppv2VpcIdEnabled
         */
        public Boolean getPpv2VpcIdEnabled() {
            return this.ppv2VpcIdEnabled;
        }

        public static final class Builder {
            private Boolean ppv2PrivateLinkEpIdEnabled; 
            private Boolean ppv2PrivateLinkEpsIdEnabled; 
            private Boolean ppv2VpcIdEnabled; 

            /**
             * <p>Indicates whether the Proxy protocol passes the PrivateLinkEpId parameter to backend servers. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ppv2PrivateLinkEpIdEnabled(Boolean ppv2PrivateLinkEpIdEnabled) {
                this.ppv2PrivateLinkEpIdEnabled = ppv2PrivateLinkEpIdEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the Proxy protocol passes the PrivateLinkEpsId parameter to backend servers. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ppv2PrivateLinkEpsIdEnabled(Boolean ppv2PrivateLinkEpsIdEnabled) {
                this.ppv2PrivateLinkEpsIdEnabled = ppv2PrivateLinkEpsIdEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the Proxy protocol passes the VpcId parameter to backend servers. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ppv2VpcIdEnabled(Boolean ppv2VpcIdEnabled) {
                this.ppv2VpcIdEnabled = ppv2VpcIdEnabled;
                return this;
            }

            public ProxyProtocolV2Config build() {
                return new ProxyProtocolV2Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TF</p>
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
     * {@link ListListenersResponseBody} extends {@link TeaModel}
     *
     * <p>ListListenersResponseBody</p>
     */
    public static class Listeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlpnEnabled")
        private Boolean alpnEnabled;

        @com.aliyun.core.annotation.NameInMap("AlpnPolicy")
        private String alpnPolicy;

        @com.aliyun.core.annotation.NameInMap("CaCertificateIds")
        private java.util.List<String> caCertificateIds;

        @com.aliyun.core.annotation.NameInMap("CaEnabled")
        private Boolean caEnabled;

        @com.aliyun.core.annotation.NameInMap("CertificateIds")
        private java.util.List<String> certificateIds;

        @com.aliyun.core.annotation.NameInMap("Cps")
        private Integer cps;

        @com.aliyun.core.annotation.NameInMap("EndPort")
        private String endPort;

        @com.aliyun.core.annotation.NameInMap("IdleTimeout")
        private Integer idleTimeout;

        @com.aliyun.core.annotation.NameInMap("ListenerDescription")
        private String listenerDescription;

        @com.aliyun.core.annotation.NameInMap("ListenerId")
        private String listenerId;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
        private Integer listenerPort;

        @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
        private String listenerProtocol;

        @com.aliyun.core.annotation.NameInMap("ListenerStatus")
        private String listenerStatus;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("Mss")
        private Integer mss;

        @com.aliyun.core.annotation.NameInMap("ProxyProtocolEnabled")
        private Boolean proxyProtocolEnabled;

        @com.aliyun.core.annotation.NameInMap("ProxyProtocolV2Config")
        private ProxyProtocolV2Config proxyProtocolV2Config;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecSensorEnabled")
        private Boolean secSensorEnabled;

        @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
        private String securityPolicyId;

        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        @com.aliyun.core.annotation.NameInMap("StartPort")
        private String startPort;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Listeners(Builder builder) {
            this.alpnEnabled = builder.alpnEnabled;
            this.alpnPolicy = builder.alpnPolicy;
            this.caCertificateIds = builder.caCertificateIds;
            this.caEnabled = builder.caEnabled;
            this.certificateIds = builder.certificateIds;
            this.cps = builder.cps;
            this.endPort = builder.endPort;
            this.idleTimeout = builder.idleTimeout;
            this.listenerDescription = builder.listenerDescription;
            this.listenerId = builder.listenerId;
            this.listenerPort = builder.listenerPort;
            this.listenerProtocol = builder.listenerProtocol;
            this.listenerStatus = builder.listenerStatus;
            this.loadBalancerId = builder.loadBalancerId;
            this.mss = builder.mss;
            this.proxyProtocolEnabled = builder.proxyProtocolEnabled;
            this.proxyProtocolV2Config = builder.proxyProtocolV2Config;
            this.regionId = builder.regionId;
            this.secSensorEnabled = builder.secSensorEnabled;
            this.securityPolicyId = builder.securityPolicyId;
            this.serverGroupId = builder.serverGroupId;
            this.startPort = builder.startPort;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Listeners create() {
            return builder().build();
        }

        /**
         * @return alpnEnabled
         */
        public Boolean getAlpnEnabled() {
            return this.alpnEnabled;
        }

        /**
         * @return alpnPolicy
         */
        public String getAlpnPolicy() {
            return this.alpnPolicy;
        }

        /**
         * @return caCertificateIds
         */
        public java.util.List<String> getCaCertificateIds() {
            return this.caCertificateIds;
        }

        /**
         * @return caEnabled
         */
        public Boolean getCaEnabled() {
            return this.caEnabled;
        }

        /**
         * @return certificateIds
         */
        public java.util.List<String> getCertificateIds() {
            return this.certificateIds;
        }

        /**
         * @return cps
         */
        public Integer getCps() {
            return this.cps;
        }

        /**
         * @return endPort
         */
        public String getEndPort() {
            return this.endPort;
        }

        /**
         * @return idleTimeout
         */
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        /**
         * @return listenerDescription
         */
        public String getListenerDescription() {
            return this.listenerDescription;
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
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        /**
         * @return listenerProtocol
         */
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        /**
         * @return listenerStatus
         */
        public String getListenerStatus() {
            return this.listenerStatus;
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return mss
         */
        public Integer getMss() {
            return this.mss;
        }

        /**
         * @return proxyProtocolEnabled
         */
        public Boolean getProxyProtocolEnabled() {
            return this.proxyProtocolEnabled;
        }

        /**
         * @return proxyProtocolV2Config
         */
        public ProxyProtocolV2Config getProxyProtocolV2Config() {
            return this.proxyProtocolV2Config;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return secSensorEnabled
         */
        public Boolean getSecSensorEnabled() {
            return this.secSensorEnabled;
        }

        /**
         * @return securityPolicyId
         */
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        /**
         * @return startPort
         */
        public String getStartPort() {
            return this.startPort;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Boolean alpnEnabled; 
            private String alpnPolicy; 
            private java.util.List<String> caCertificateIds; 
            private Boolean caEnabled; 
            private java.util.List<String> certificateIds; 
            private Integer cps; 
            private String endPort; 
            private Integer idleTimeout; 
            private String listenerDescription; 
            private String listenerId; 
            private Integer listenerPort; 
            private String listenerProtocol; 
            private String listenerStatus; 
            private String loadBalancerId; 
            private Integer mss; 
            private Boolean proxyProtocolEnabled; 
            private ProxyProtocolV2Config proxyProtocolV2Config; 
            private String regionId; 
            private Boolean secSensorEnabled; 
            private String securityPolicyId; 
            private String serverGroupId; 
            private String startPort; 
            private java.util.List<Tags> tags; 

            /**
             * <p>Indicates whether Application-Layer Protocol Negotiation (ALPN) is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder alpnEnabled(Boolean alpnEnabled) {
                this.alpnEnabled = alpnEnabled;
                return this;
            }

            /**
             * <p>The ALPN policy. Valid values:</p>
             * <ul>
             * <li><strong>HTTP1Only</strong></li>
             * <li><strong>HTTP2Only</strong></li>
             * <li><strong>HTTP2Preferred</strong></li>
             * <li><strong>HTTP2Optional</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP1Only</p>
             */
            public Builder alpnPolicy(String alpnPolicy) {
                this.alpnPolicy = alpnPolicy;
                return this;
            }

            /**
             * <p>A list of CA certificates.</p>
             * <blockquote>
             * <p> This parameter takes effect only for listeners that use SSL over TCP.</p>
             * </blockquote>
             */
            public Builder caCertificateIds(java.util.List<String> caCertificateIds) {
                this.caCertificateIds = caCertificateIds;
                return this;
            }

            /**
             * <p>Indicates whether mutual authentication is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder caEnabled(Boolean caEnabled) {
                this.caEnabled = caEnabled;
                return this;
            }

            /**
             * <p>The server certificate.</p>
             * <blockquote>
             * <p> This parameter takes effect only for listeners that use SSL over TCP.</p>
             * </blockquote>
             */
            public Builder certificateIds(java.util.List<String> certificateIds) {
                this.certificateIds = certificateIds;
                return this;
            }

            /**
             * <p>The maximum number of new connections per second supported by the listener in each zone (virtual IP address). Valid values: <strong>0</strong> to <strong>1000000</strong>. <strong>0</strong> indicates that the number of connections is unlimited.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder cps(Integer cps) {
                this.cps = cps;
                return this;
            }

            /**
             * <p>The last port in the listener port range.</p>
             * 
             * <strong>example:</strong>
             * <p>455</p>
             */
            public Builder endPort(String endPort) {
                this.endPort = endPort;
                return this;
            }

            /**
             * <p>The timeout period of idle connections. Unit: seconds. Valid values: <strong>1</strong> to <strong>900</strong>. Default value: <strong>900</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder idleTimeout(Integer idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * <p>The name of the listener.</p>
             * <p>The name must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
             * 
             * <strong>example:</strong>
             * <p>tcpssl_443</p>
             */
            public Builder listenerDescription(String listenerDescription) {
                this.listenerDescription = listenerDescription;
                return this;
            }

            /**
             * <p>The listener ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lsn-ga6sjjcll6ou34l1et****</p>
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * <p>The information about the listener port of your server.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * <p>The listener protocol. Valid values: <strong>TCP</strong>, <strong>UDP</strong>, and <strong>TCPSSL</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>TCPSSL</p>
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * <p>The status of the listener. Valid values:</p>
             * <ul>
             * <li><strong>Provisioning</strong>: The listener is being created.</li>
             * <li><strong>Running</strong>: The listener is running.</li>
             * <li><strong>Configuring</strong>: The listener is being configured.</li>
             * <li><strong>Stopping</strong>: The listener is being stopped.</li>
             * <li><strong>Stopped</strong>: The listener is stopped.</li>
             * <li><strong>Starting</strong>: The listener is being started.</li>
             * <li><strong>Deleting</strong>: The listener is being deleted.</li>
             * <li><strong>Deleted</strong>: The listener is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder listenerStatus(String listenerStatus) {
                this.listenerStatus = listenerStatus;
                return this;
            }

            /**
             * <p>The CLB instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>nlb-83ckzc8d4xlp8o****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The size of the largest TCP packet segment. Unit: bytes. Valid values: <strong>0</strong> to <strong>1500</strong>. <strong>0</strong> indicates that the Mss value of TCP packets remains unchanged.</p>
             * <blockquote>
             * <p> This parameter takes effect only for listeners that use SSL over TCP.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder mss(Integer mss) {
                this.mss = mss;
                return this;
            }

            /**
             * <p>Indicates whether the Proxy protocol passes source client IP addresses to backend servers. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder proxyProtocolEnabled(Boolean proxyProtocolEnabled) {
                this.proxyProtocolEnabled = proxyProtocolEnabled;
                return this;
            }

            /**
             * <p>Indicates whether the Proxy protocol passes the VpcId, PrivateLinkEpId, and PrivateLinkEpsId parameters to backend servers.</p>
             */
            public Builder proxyProtocolV2Config(ProxyProtocolV2Config proxyProtocolV2Config) {
                this.proxyProtocolV2Config = proxyProtocolV2Config;
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
             * <p>Indicates whether fine-grained monitoring is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder secSensorEnabled(Boolean secSensorEnabled) {
                this.secSensorEnabled = secSensorEnabled;
                return this;
            }

            /**
             * <p>The ID of the security policy.</p>
             * <blockquote>
             * <p> This parameter takes effect only for listeners that use SSL over TCP.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>tls_cipher_policy_1_1</p>
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * <p>The server group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-ppdpc14gdm3x4o****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * <p>The first port in the listener port range.</p>
             * 
             * <strong>example:</strong>
             * <p>233</p>
             */
            public Builder startPort(String startPort) {
                this.startPort = startPort;
                return this;
            }

            /**
             * <p>A list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}
