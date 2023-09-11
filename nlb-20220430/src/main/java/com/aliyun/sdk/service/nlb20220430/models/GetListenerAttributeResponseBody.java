// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetListenerAttributeResponseBody</p>
 */
public class GetListenerAttributeResponseBody extends TeaModel {
    @NameInMap("AlpnEnabled")
    private Boolean alpnEnabled;

    @NameInMap("AlpnPolicy")
    private String alpnPolicy;

    @NameInMap("CaCertificateIds")
    private java.util.List < String > caCertificateIds;

    @NameInMap("CaEnabled")
    private Boolean caEnabled;

    @NameInMap("CertificateIds")
    private java.util.List < String > certificateIds;

    @NameInMap("Cps")
    private Integer cps;

    @NameInMap("EndPort")
    private String endPort;

    @NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @NameInMap("ListenerDescription")
    private String listenerDescription;

    @NameInMap("ListenerId")
    private String listenerId;

    @NameInMap("ListenerPort")
    private Integer listenerPort;

    @NameInMap("ListenerProtocol")
    private String listenerProtocol;

    @NameInMap("ListenerStatus")
    private String listenerStatus;

    @NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @NameInMap("Mss")
    private Integer mss;

    @NameInMap("ProxyProtocolEnabled")
    private Boolean proxyProtocolEnabled;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecSensorEnabled")
    private Boolean secSensorEnabled;

    @NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @NameInMap("ServerGroupId")
    private String serverGroupId;

    @NameInMap("StartPort")
    private String startPort;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private GetListenerAttributeResponseBody(Builder builder) {
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
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.secSensorEnabled = builder.secSensorEnabled;
        this.securityPolicyId = builder.securityPolicyId;
        this.serverGroupId = builder.serverGroupId;
        this.startPort = builder.startPort;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListenerAttributeResponseBody create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String regionId; 
        private String requestId; 
        private Boolean secSensorEnabled; 
        private String securityPolicyId; 
        private String serverGroupId; 
        private String startPort; 
        private java.util.List < Tags> tags; 

        /**
         * Indicates whether Application-Layer Protocol Negotiation (ALPN) is enabled. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
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
         * The CA certificates. Only one CA certificate is supported.
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
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder caEnabled(Boolean caEnabled) {
            this.caEnabled = caEnabled;
            return this;
        }

        /**
         * The server certificates. Only one server certificate is supported.
         * <p>
         * 
         * >  This parameter takes effect only for listeners that use SSL over TCP.
         */
        public Builder certificateIds(java.util.List < String > certificateIds) {
            this.certificateIds = certificateIds;
            return this;
        }

        /**
         * The maximum number of connections that can be created per second on the NLB instance. Valid values: **0** to **1000000**. **0** specifies that the number of connections is unlimited.
         */
        public Builder cps(Integer cps) {
            this.cps = cps;
            return this;
        }

        /**
         * The last port in the listening port range. Valid values: **0** to **65535**. The number of the last port must be smaller than that of the first port.
         */
        public Builder endPort(String endPort) {
            this.endPort = endPort;
            return this;
        }

        /**
         * The timeout period of an idle connection. Unit: seconds. Valid values: **1** to **900**.
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
         * The ID of the listener.
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The listening port. Valid values: **0** to **65535**. A value of **0** specifies all ports. If you set the value to **0**, you must also set the **StartPort** and **EndPort** parameters.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * The listening protocol. Valid values: **TCP**, **UDP**, and **TCPSSL**.
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
         * The ID of the NLB instance.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The size of the largest TCP segment. Unit: bytes. Valid values: **0** to **1500**. **0** specifies that the maximum segment size remains unchanged.
         * <p>
         * 
         * >  This parameter is supported only by listeners that use SSL over TCP.
         */
        public Builder mss(Integer mss) {
            this.mss = mss;
            return this;
        }

        /**
         * Indicates whether the Proxy protocol is used to pass client IP addresses to backend servers. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder proxyProtocolEnabled(Boolean proxyProtocolEnabled) {
            this.proxyProtocolEnabled = proxyProtocolEnabled;
            return this;
        }

        /**
         * The ID of the region where the NLB instance is deployed.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
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
         * Indicates whether fine-grained monitoring is enabled. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder secSensorEnabled(Boolean secSensorEnabled) {
            this.secSensorEnabled = secSensorEnabled;
            return this;
        }

        /**
         * The ID of the security policy. System security policies and custom security policies are supported.
         * <p>
         * 
         * Valid values: **tls_cipher_policy\_1\_0**, **tls_cipher_policy\_1\_1**, **tls_cipher_policy\_1\_2**, **tls_cipher_policy\_1\_2\_strict**, and **tls_cipher_policy\_1\_2\_strict_with\_1\_3**.
         * 
         * >  This parameter takes effect only for listeners that use SSL over TCP.
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * The ID of the server group.
         */
        public Builder serverGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * The first port in the listening port range. Valid values: **0** to **65535**.
         */
        public Builder startPort(String startPort) {
            this.startPort = startPort;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        public GetListenerAttributeResponseBody build() {
            return new GetListenerAttributeResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The key of the tag that you want to remove. You can remove up to 20 tags in each call.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
