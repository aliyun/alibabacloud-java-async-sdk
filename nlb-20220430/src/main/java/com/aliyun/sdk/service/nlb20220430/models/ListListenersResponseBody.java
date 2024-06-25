// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListListenersResponseBody} extends {@link TeaModel}
 *
 * <p>ListListenersResponseBody</p>
 */
public class ListListenersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Listeners")
    private java.util.List < Listeners> listeners;

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
    public java.util.List < Listeners> getListeners() {
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
        private java.util.List < Listeners> listeners; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * A list of listeners.
         */
        public Builder listeners(java.util.List < Listeners> listeners) {
            this.listeners = listeners;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, it indicates that no next query is to be sent.
         * *   If a value of **NextToken** is returned, the value is the token used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListListenersResponseBody build() {
            return new ListListenersResponseBody(this);
        } 

    } 

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
             * Indicates whether the Proxy protocol passes the PrivateLinkEpId parameter to backend servers. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder ppv2PrivateLinkEpIdEnabled(Boolean ppv2PrivateLinkEpIdEnabled) {
                this.ppv2PrivateLinkEpIdEnabled = ppv2PrivateLinkEpIdEnabled;
                return this;
            }

            /**
             * Indicates whether the Proxy protocol passes the PrivateLinkEpsId parameter to backend servers. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder ppv2PrivateLinkEpsIdEnabled(Boolean ppv2PrivateLinkEpsIdEnabled) {
                this.ppv2PrivateLinkEpsIdEnabled = ppv2PrivateLinkEpsIdEnabled;
                return this;
            }

            /**
             * Indicates whether the Proxy protocol passes the VpcId parameter to backend servers. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
    public static class Listeners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlpnEnabled")
        private Boolean alpnEnabled;

        @com.aliyun.core.annotation.NameInMap("AlpnPolicy")
        private String alpnPolicy;

        @com.aliyun.core.annotation.NameInMap("CaCertificateIds")
        private java.util.List < String > caCertificateIds;

        @com.aliyun.core.annotation.NameInMap("CaEnabled")
        private Boolean caEnabled;

        @com.aliyun.core.annotation.NameInMap("CertificateIds")
        private java.util.List < String > certificateIds;

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
        private java.util.List < Tags> tags;

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
        public java.util.List < String > getCaCertificateIds() {
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
        public java.util.List < String > getCertificateIds() {
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Boolean alpnEnabled; 
            private String alpnPolicy; 
            private java.util.List < String > caCertificateIds; 
            private Boolean caEnabled; 
            private java.util.List < String > certificateIds; 
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
            private java.util.List < Tags> tags; 

            /**
             * Indicates whether Application-Layer Protocol Negotiation (ALPN) is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder alpnEnabled(Boolean alpnEnabled) {
                this.alpnEnabled = alpnEnabled;
                return this;
            }

            /**
             * The ALPN policy. Valid values:
             * <p>
             * 
             * *   **HTTP1Only**
             * *   **HTTP2Only**
             * *   **HTTP2Preferred**
             * *   **HTTP2Optional**
             */
            public Builder alpnPolicy(String alpnPolicy) {
                this.alpnPolicy = alpnPolicy;
                return this;
            }

            /**
             * A list of CA certificates.
             * <p>
             * 
             * >  This parameter takes effect only for listeners that use SSL over TCP.
             */
            public Builder caCertificateIds(java.util.List < String > caCertificateIds) {
                this.caCertificateIds = caCertificateIds;
                return this;
            }

            /**
             * Indicates whether mutual authentication is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder caEnabled(Boolean caEnabled) {
                this.caEnabled = caEnabled;
                return this;
            }

            /**
             * The server certificate.
             * <p>
             * 
             * >  This parameter takes effect only for listeners that use SSL over TCP.
             */
            public Builder certificateIds(java.util.List < String > certificateIds) {
                this.certificateIds = certificateIds;
                return this;
            }

            /**
             * The maximum number of connections that can be created per second on the NLB instance. Valid values: **0** to **1000000**. **0** indicates that the number of connections is unlimited.
             */
            public Builder cps(Integer cps) {
                this.cps = cps;
                return this;
            }

            /**
             * The last port in the listener port range.
             */
            public Builder endPort(String endPort) {
                this.endPort = endPort;
                return this;
            }

            /**
             * The timeout period of idle connections. Unit: seconds. Valid values: **1** to **900**. Default value: **900**.
             */
            public Builder idleTimeout(Integer idleTimeout) {
                this.idleTimeout = idleTimeout;
                return this;
            }

            /**
             * The name of the listener.
             * <p>
             * 
             * The name must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (\_), and hyphens (-).
             */
            public Builder listenerDescription(String listenerDescription) {
                this.listenerDescription = listenerDescription;
                return this;
            }

            /**
             * The listener ID.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The information about the listener port of your server.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            /**
             * The listener protocol. Valid values: **TCP**, **UDP**, and **TCPSSL**.
             */
            public Builder listenerProtocol(String listenerProtocol) {
                this.listenerProtocol = listenerProtocol;
                return this;
            }

            /**
             * The status of the listener. Valid values:
             * <p>
             * 
             * *   **Provisioning**: The listener is being created.
             * *   **Running**: The listener is running.
             * *   **Configuring**: The listener is being configured.
             * *   **Stopping**: The listener is being stopped.
             * *   **Stopped**: The listener is stopped.
             * *   **Starting**: The listener is being started.
             * *   **Deleting**: The listener is being deleted.
             * *   **Deleted**: The listener is deleted.
             */
            public Builder listenerStatus(String listenerStatus) {
                this.listenerStatus = listenerStatus;
                return this;
            }

            /**
             * The CLB instance ID.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The size of the largest TCP packet segment. Unit: bytes. Valid values: **0** to **1500**. **0** indicates that the Mss value of TCP packets remains unchanged.
             * <p>
             * 
             * >  This parameter takes effect only for listeners that use SSL over TCP.
             */
            public Builder mss(Integer mss) {
                this.mss = mss;
                return this;
            }

            /**
             * Indicates whether the Proxy protocol passes source client IP addresses to backend servers. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder proxyProtocolEnabled(Boolean proxyProtocolEnabled) {
                this.proxyProtocolEnabled = proxyProtocolEnabled;
                return this;
            }

            /**
             * Indicates whether the Proxy protocol passes the VpcId, PrivateLinkEpId, and PrivateLinkEpsId parameters to backend servers.
             */
            public Builder proxyProtocolV2Config(ProxyProtocolV2Config proxyProtocolV2Config) {
                this.proxyProtocolV2Config = proxyProtocolV2Config;
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
             * Indicates whether fine-grained monitoring is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder secSensorEnabled(Boolean secSensorEnabled) {
                this.secSensorEnabled = secSensorEnabled;
                return this;
            }

            /**
             * The ID of the security policy.
             * <p>
             * 
             * >  This parameter takes effect only for listeners that use SSL over TCP.
             */
            public Builder securityPolicyId(String securityPolicyId) {
                this.securityPolicyId = securityPolicyId;
                return this;
            }

            /**
             * The server group ID.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * The first port in the listener port range.
             */
            public Builder startPort(String startPort) {
                this.startPort = startPort;
                return this;
            }

            /**
             * A list of tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Listeners build() {
                return new Listeners(this);
            } 

        } 

    }
}
