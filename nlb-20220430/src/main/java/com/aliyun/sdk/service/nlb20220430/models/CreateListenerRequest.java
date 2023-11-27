// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateListenerRequest} extends {@link RequestModel}
 *
 * <p>CreateListenerRequest</p>
 */
public class CreateListenerRequest extends Request {
    @Body
    @NameInMap("AlpnEnabled")
    private Boolean alpnEnabled;

    @Body
    @NameInMap("AlpnPolicy")
    private String alpnPolicy;

    @Body
    @NameInMap("CaCertificateIds")
    private java.util.List < String > caCertificateIds;

    @Body
    @NameInMap("CaEnabled")
    private Boolean caEnabled;

    @Body
    @NameInMap("CertificateIds")
    private java.util.List < String > certificateIds;

    @Body
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("Cps")
    private Integer cps;

    @Body
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Body
    @NameInMap("EndPort")
    private Integer endPort;

    @Body
    @NameInMap("IdleTimeout")
    @Validation(maximum = 900, minimum = 1)
    private Integer idleTimeout;

    @Body
    @NameInMap("ListenerDescription")
    private String listenerDescription;

    @Body
    @NameInMap("ListenerPort")
    @Validation(required = true, maximum = 65535)
    private Integer listenerPort;

    @Body
    @NameInMap("ListenerProtocol")
    @Validation(required = true)
    private String listenerProtocol;

    @Body
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    @Body
    @NameInMap("Mss")
    private Integer mss;

    @Body
    @NameInMap("ProxyProtocolEnabled")
    private Boolean proxyProtocolEnabled;

    @Body
    @NameInMap("ProxyProtocolV2Config")
    private ProxyProtocolV2Config proxyProtocolV2Config;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SecSensorEnabled")
    private Boolean secSensorEnabled;

    @Body
    @NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @Body
    @NameInMap("ServerGroupId")
    @Validation(required = true)
    private String serverGroupId;

    @Body
    @NameInMap("StartPort")
    private Integer startPort;

    @Body
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateListenerRequest(Builder builder) {
        super(builder);
        this.alpnEnabled = builder.alpnEnabled;
        this.alpnPolicy = builder.alpnPolicy;
        this.caCertificateIds = builder.caCertificateIds;
        this.caEnabled = builder.caEnabled;
        this.certificateIds = builder.certificateIds;
        this.clientToken = builder.clientToken;
        this.cps = builder.cps;
        this.dryRun = builder.dryRun;
        this.endPort = builder.endPort;
        this.idleTimeout = builder.idleTimeout;
        this.listenerDescription = builder.listenerDescription;
        this.listenerPort = builder.listenerPort;
        this.listenerProtocol = builder.listenerProtocol;
        this.loadBalancerId = builder.loadBalancerId;
        this.mss = builder.mss;
        this.proxyProtocolEnabled = builder.proxyProtocolEnabled;
        this.proxyProtocolV2Config = builder.proxyProtocolV2Config;
        this.regionId = builder.regionId;
        this.secSensorEnabled = builder.secSensorEnabled;
        this.securityPolicyId = builder.securityPolicyId;
        this.serverGroupId = builder.serverGroupId;
        this.startPort = builder.startPort;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateListenerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cps
     */
    public Integer getCps() {
        return this.cps;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return endPort
     */
    public Integer getEndPort() {
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
    public Integer getStartPort() {
        return this.startPort;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateListenerRequest, Builder> {
        private Boolean alpnEnabled; 
        private String alpnPolicy; 
        private java.util.List < String > caCertificateIds; 
        private Boolean caEnabled; 
        private java.util.List < String > certificateIds; 
        private String clientToken; 
        private Integer cps; 
        private Boolean dryRun; 
        private Integer endPort; 
        private Integer idleTimeout; 
        private String listenerDescription; 
        private Integer listenerPort; 
        private String listenerProtocol; 
        private String loadBalancerId; 
        private Integer mss; 
        private Boolean proxyProtocolEnabled; 
        private ProxyProtocolV2Config proxyProtocolV2Config; 
        private String regionId; 
        private Boolean secSensorEnabled; 
        private String securityPolicyId; 
        private String serverGroupId; 
        private Integer startPort; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateListenerRequest request) {
            super(request);
            this.alpnEnabled = request.alpnEnabled;
            this.alpnPolicy = request.alpnPolicy;
            this.caCertificateIds = request.caCertificateIds;
            this.caEnabled = request.caEnabled;
            this.certificateIds = request.certificateIds;
            this.clientToken = request.clientToken;
            this.cps = request.cps;
            this.dryRun = request.dryRun;
            this.endPort = request.endPort;
            this.idleTimeout = request.idleTimeout;
            this.listenerDescription = request.listenerDescription;
            this.listenerPort = request.listenerPort;
            this.listenerProtocol = request.listenerProtocol;
            this.loadBalancerId = request.loadBalancerId;
            this.mss = request.mss;
            this.proxyProtocolEnabled = request.proxyProtocolEnabled;
            this.proxyProtocolV2Config = request.proxyProtocolV2Config;
            this.regionId = request.regionId;
            this.secSensorEnabled = request.secSensorEnabled;
            this.securityPolicyId = request.securityPolicyId;
            this.serverGroupId = request.serverGroupId;
            this.startPort = request.startPort;
            this.tag = request.tag;
        } 

        /**
         * Specifies whether to enable Application-Layer Protocol Negotiation (ALPN). Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder alpnEnabled(Boolean alpnEnabled) {
            this.putBodyParameter("AlpnEnabled", alpnEnabled);
            this.alpnEnabled = alpnEnabled;
            return this;
        }

        /**
         * The ALPN policy.
         * <p>
         * 
         * Valid values:
         * 
         * *   HTTP1Only
         * *   HTTP2Only
         * *   HTTP2Preferred
         * *   HTTP2Optional
         */
        public Builder alpnPolicy(String alpnPolicy) {
            this.putBodyParameter("AlpnPolicy", alpnPolicy);
            this.alpnPolicy = alpnPolicy;
            return this;
        }

        /**
         * The certificate authority (CA) certificates. This parameter takes effect only for listeners that use SSL over TCP.
         * <p>
         * 
         * > You can specify only one CA certificate.
         */
        public Builder caCertificateIds(java.util.List < String > caCertificateIds) {
            this.putBodyParameter("CaCertificateIds", caCertificateIds);
            this.caCertificateIds = caCertificateIds;
            return this;
        }

        /**
         * Specifies whether to enable mutual authentication. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder caEnabled(Boolean caEnabled) {
            this.putBodyParameter("CaEnabled", caEnabled);
            this.caEnabled = caEnabled;
            return this;
        }

        /**
         * The server certificates. This parameter takes effect only for listeners that use SSL over TCP.
         * <p>
         * 
         * > You can specify only one server certificate.
         */
        public Builder certificateIds(java.util.List < String > certificateIds) {
            this.putBodyParameter("CertificateIds", certificateIds);
            this.certificateIds = certificateIds;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The maximum number of connections that can be created per second on the NLB instance. Valid values: **0** to **1000000**. **0** specifies that the number of connections is unlimited.
         */
        public Builder cps(Integer cps) {
            this.putBodyParameter("Cps", cps);
            this.cps = cps;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false**(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The last port in the listener port range. Valid values: **0** to **65535**. The number of the last port must be greater than the number of the first port.
         * <p>
         * 
         * > This parameter is required when **ListenerPort** is set to **0**.
         */
        public Builder endPort(Integer endPort) {
            this.putBodyParameter("EndPort", endPort);
            this.endPort = endPort;
            return this;
        }

        /**
         * The timeout period of idle connections. Unit: seconds. Valid values: **1** to **900**. Default value: **900**.
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putBodyParameter("IdleTimeout", idleTimeout);
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
            this.putBodyParameter("ListenerDescription", listenerDescription);
            this.listenerDescription = listenerDescription;
            return this;
        }

        /**
         * The listener port. Valid values: **0** to **65535**.
         * <p>
         * 
         * If you set the value to **0**, the listener listens by port range. If you set the value to **0**, you must specify **StartPort** and **EndPort**.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putBodyParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * The listener protocol. Valid values: **TCP**, **UDP**, and **TCPSSL**.
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.putBodyParameter("ListenerProtocol", listenerProtocol);
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * The ID of the Network Load Balancer (NLB) instance.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putBodyParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * The maximum size of a TCP segment. Unit: bytes. Valid values: **0** to **1500**. **0** specifies that the maximum segment size remains unchanged.
         * <p>
         * 
         * > This parameter is supported only by TCP listeners and listeners that use SSL over TCP.
         */
        public Builder mss(Integer mss) {
            this.putBodyParameter("Mss", mss);
            this.mss = mss;
            return this;
        }

        /**
         * Specifies whether to use the Proxy protocol to pass client IP addresses to backend servers. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder proxyProtocolEnabled(Boolean proxyProtocolEnabled) {
            this.putBodyParameter("ProxyProtocolEnabled", proxyProtocolEnabled);
            this.proxyProtocolEnabled = proxyProtocolEnabled;
            return this;
        }

        /**
         * ProxyProtocolV2Config.
         */
        public Builder proxyProtocolV2Config(ProxyProtocolV2Config proxyProtocolV2Config) {
            String proxyProtocolV2ConfigShrink = shrink(proxyProtocolV2Config, "ProxyProtocolV2Config", "json");
            this.putBodyParameter("ProxyProtocolV2Config", proxyProtocolV2ConfigShrink);
            this.proxyProtocolV2Config = proxyProtocolV2Config;
            return this;
        }

        /**
         * The region ID of the NLB instance.
         * <p>
         * 
         * You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Specifies whether to enable fine-grained monitoring. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder secSensorEnabled(Boolean secSensorEnabled) {
            this.putBodyParameter("SecSensorEnabled", secSensorEnabled);
            this.secSensorEnabled = secSensorEnabled;
            return this;
        }

        /**
         * The security policy ID. System security policies and custom security policies are supported.
         * <p>
         * 
         * Valid values: **tls_cipher_policy\_1\_0** (default), **tls_cipher_policy\_1\_1**, **tls_cipher_policy\_1\_2**, **tls_cipher_policy\_1\_2\_strict**, and **tls_cipher_policy\_1\_2\_strict_with\_1\_3**.
         * 
         * > This parameter takes effect only for listeners that use SSL over TCP.
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.putBodyParameter("SecurityPolicyId", securityPolicyId);
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * The server group ID.
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putBodyParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        /**
         * The first port in the listener port range. Valid values: **0** to **65535**.
         * <p>
         * 
         * > This parameter is required when **ListenerPort** is set to **0**.
         */
        public Builder startPort(Integer startPort) {
            this.putBodyParameter("StartPort", startPort);
            this.startPort = startPort;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateListenerRequest build() {
            return new CreateListenerRequest(this);
        } 

    } 

    public static class ProxyProtocolV2Config extends TeaModel {
        @NameInMap("Ppv2PrivateLinkEpIdEnabled")
        private Boolean ppv2PrivateLinkEpIdEnabled;

        @NameInMap("Ppv2PrivateLinkEpsIdEnabled")
        private Boolean ppv2PrivateLinkEpsIdEnabled;

        @NameInMap("Ppv2VpcIdEnabled")
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
             * Ppv2PrivateLinkEpIdEnabled.
             */
            public Builder ppv2PrivateLinkEpIdEnabled(Boolean ppv2PrivateLinkEpIdEnabled) {
                this.ppv2PrivateLinkEpIdEnabled = ppv2PrivateLinkEpIdEnabled;
                return this;
            }

            /**
             * Ppv2PrivateLinkEpsIdEnabled.
             */
            public Builder ppv2PrivateLinkEpsIdEnabled(Boolean ppv2PrivateLinkEpsIdEnabled) {
                this.ppv2PrivateLinkEpsIdEnabled = ppv2PrivateLinkEpsIdEnabled;
                return this;
            }

            /**
             * Ppv2VpcIdEnabled.
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
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             * <p>
             * 
             * You can add up to 20 tags in each call.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
