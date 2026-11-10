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
 * {@link UpdateListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateListenerAttributeRequest</p>
 */
public class UpdateListenerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlpnEnabled")
    private Boolean alpnEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlpnPolicy")
    private String alpnPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CaCertificateIds")
    private java.util.List<String> caCertificateIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CaEnabled")
    private Boolean caEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CertificateIds")
    private java.util.List<String> certificateIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Cps")
    private Integer cps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListenerDescription")
    private String listenerDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mss")
    private Integer mss;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyProtocolEnabled")
    private Boolean proxyProtocolEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyProtocolV2Config")
    private ProxyProtocolV2Config proxyProtocolV2Config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecSensorEnabled")
    private Boolean secSensorEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityPolicyId")
    private String securityPolicyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServerGroupId")
    private String serverGroupId;

    private UpdateListenerAttributeRequest(Builder builder) {
        super(builder);
        this.alpnEnabled = builder.alpnEnabled;
        this.alpnPolicy = builder.alpnPolicy;
        this.caCertificateIds = builder.caCertificateIds;
        this.caEnabled = builder.caEnabled;
        this.certificateIds = builder.certificateIds;
        this.clientToken = builder.clientToken;
        this.cps = builder.cps;
        this.dryRun = builder.dryRun;
        this.idleTimeout = builder.idleTimeout;
        this.listenerDescription = builder.listenerDescription;
        this.listenerId = builder.listenerId;
        this.mss = builder.mss;
        this.proxyProtocolEnabled = builder.proxyProtocolEnabled;
        this.proxyProtocolV2Config = builder.proxyProtocolV2Config;
        this.regionId = builder.regionId;
        this.secSensorEnabled = builder.secSensorEnabled;
        this.securityPolicyId = builder.securityPolicyId;
        this.serverGroupId = builder.serverGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateListenerAttributeRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateListenerAttributeRequest, Builder> {
        private Boolean alpnEnabled; 
        private String alpnPolicy; 
        private java.util.List<String> caCertificateIds; 
        private Boolean caEnabled; 
        private java.util.List<String> certificateIds; 
        private String clientToken; 
        private Integer cps; 
        private Boolean dryRun; 
        private Integer idleTimeout; 
        private String listenerDescription; 
        private String listenerId; 
        private Integer mss; 
        private Boolean proxyProtocolEnabled; 
        private ProxyProtocolV2Config proxyProtocolV2Config; 
        private String regionId; 
        private Boolean secSensorEnabled; 
        private String securityPolicyId; 
        private String serverGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateListenerAttributeRequest request) {
            super(request);
            this.alpnEnabled = request.alpnEnabled;
            this.alpnPolicy = request.alpnPolicy;
            this.caCertificateIds = request.caCertificateIds;
            this.caEnabled = request.caEnabled;
            this.certificateIds = request.certificateIds;
            this.clientToken = request.clientToken;
            this.cps = request.cps;
            this.dryRun = request.dryRun;
            this.idleTimeout = request.idleTimeout;
            this.listenerDescription = request.listenerDescription;
            this.listenerId = request.listenerId;
            this.mss = request.mss;
            this.proxyProtocolEnabled = request.proxyProtocolEnabled;
            this.proxyProtocolV2Config = request.proxyProtocolV2Config;
            this.regionId = request.regionId;
            this.secSensorEnabled = request.secSensorEnabled;
            this.securityPolicyId = request.securityPolicyId;
            this.serverGroupId = request.serverGroupId;
        } 

        /**
         * <p>Specifies whether to enable Application-Layer Protocol Negotiation (ALPN). Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables ALPN.</p>
         * </li>
         * <li><p><strong>false</strong>: disables ALPN.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder alpnEnabled(Boolean alpnEnabled) {
            this.putBodyParameter("AlpnEnabled", alpnEnabled);
            this.alpnEnabled = alpnEnabled;
            return this;
        }

        /**
         * <p>The ALPN policy. Valid values:</p>
         * <ul>
         * <li><strong>HTTP1Only</strong>: negotiates only HTTP/1.x. The priority is HTTP/1.1 &gt; HTTP/1.0.</li>
         * <li><strong>HTTP2Only</strong>: negotiates only HTTP/2.</li>
         * <li><strong>HTTP2Optional</strong>: prefers HTTP/1.x but also accepts HTTP/2. The priority is HTTP/1.1 &gt; HTTP/1.0 &gt; HTTP/2.</li>
         * <li><strong>HTTP2Preferred</strong>: prefers HTTP/2 but also accepts HTTP/1.x. The priority is HTTP/2 &gt; HTTP/1.1 &gt; HTTP/1.0.</li>
         * </ul>
         * <blockquote>
         * <p>You must configure this parameter after ALPN is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HTTP1Only</p>
         */
        public Builder alpnPolicy(String alpnPolicy) {
            this.putBodyParameter("AlpnPolicy", alpnPolicy);
            this.alpnPolicy = alpnPolicy;
            return this;
        }

        /**
         * <p>The CA certificates. You can add only one CA certificate.</p>
         * <blockquote>
         * <p>This parameter takes effect only for TCPSSL listeners.</p>
         * </blockquote>
         */
        public Builder caCertificateIds(java.util.List<String> caCertificateIds) {
            this.putBodyParameter("CaCertificateIds", caCertificateIds);
            this.caCertificateIds = caCertificateIds;
            return this;
        }

        /**
         * <p>Specifies whether to enable mutual authentication. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables mutual authentication.</p>
         * </li>
         * <li><p><strong>false</strong> (default): disables mutual authentication.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder caEnabled(Boolean caEnabled) {
            this.putBodyParameter("CaEnabled", caEnabled);
            this.caEnabled = caEnabled;
            return this;
        }

        /**
         * <p>The server certificates. You can add only one server certificate.</p>
         * <blockquote>
         * <p>This parameter takes effect only for TCPSSL listeners.</p>
         * </blockquote>
         */
        public Builder certificateIds(java.util.List<String> certificateIds) {
            this.putBodyParameter("CertificateIds", certificateIds);
            this.certificateIds = certificateIds;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The maximum number of new connections per second that the listener can process in each zone (VIP). Valid values: <strong>0</strong> to <strong>1000000</strong>. A value of <strong>0</strong> indicates that no limit is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder cps(Integer cps) {
            this.putBodyParameter("Cps", cps);
            this.cps = cps;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: prechecks the request without updating the listener. The system checks whether required parameters are specified, the request format is valid, and the service limits are met. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): sends the request. If the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The idle connection timeout period. Unit: seconds.</p>
         * <ul>
         * <li><p>If the listener is a <strong>TCP</strong> or <strong>TCPSSL</strong> listener, valid values are <strong>10</strong> to <strong>900</strong>. Default value: <strong>900</strong>.</p>
         * </li>
         * <li><p>If the listener is a <strong>UDP</strong> listener, valid values are <strong>10</strong> to <strong>90</strong>. Default value: <strong>90</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putBodyParameter("IdleTimeout", idleTimeout);
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>The custom name of the listener.</p>
         * <p>The name must be 2 to 256 characters in length, and can contain Chinese characters, English letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>tcpssl_443</p>
         */
        public Builder listenerDescription(String listenerDescription) {
            this.putBodyParameter("ListenerDescription", listenerDescription);
            this.listenerDescription = listenerDescription;
            return this;
        }

        /**
         * <p>The listener instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-bp1bpn0kn908w4nbw****@443</p>
         */
        public Builder listenerId(String listenerId) {
            this.putBodyParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The maximum segment size (MSS) of a TCP packet. Unit: bytes. Valid values: <strong>0</strong> to <strong>1500</strong>. A value of <strong>0</strong> indicates that the MSS value of user TCP packets is not modified. This parameter is supported only by TCP and TCPSSL listeners.</p>
         * 
         * <strong>example:</strong>
         * <p>344</p>
         */
        public Builder mss(Integer mss) {
            this.putBodyParameter("Mss", mss);
            this.mss = mss;
            return this;
        }

        /**
         * <p>Specifies whether to use the Proxy Protocol to pass the client source IP address to backend servers. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: yes.</p>
         * </li>
         * <li><p><strong>false</strong>: no.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder proxyProtocolEnabled(Boolean proxyProtocolEnabled) {
            this.putBodyParameter("ProxyProtocolEnabled", proxyProtocolEnabled);
            this.proxyProtocolEnabled = proxyProtocolEnabled;
            return this;
        }

        /**
         * <p>The configuration for passing the VpcId, PrivateLinkEpId, and PrivateLinkEpsId information to backend servers by using the Proxy Protocol.</p>
         */
        public Builder proxyProtocolV2Config(ProxyProtocolV2Config proxyProtocolV2Config) {
            String proxyProtocolV2ConfigShrink = shrink(proxyProtocolV2Config, "ProxyProtocolV2Config", "json");
            this.putBodyParameter("ProxyProtocolV2Config", proxyProtocolV2ConfigShrink);
            this.proxyProtocolV2Config = proxyProtocolV2Config;
            return this;
        }

        /**
         * <p>The ID of the region where the Network Load Balancer (NLB) instance is deployed. </p>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to retrieve the region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to enable second-level monitoring. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables second-level monitoring.</p>
         * </li>
         * <li><p><strong>false</strong>: disables second-level monitoring.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder secSensorEnabled(Boolean secSensorEnabled) {
            this.putBodyParameter("SecSensorEnabled", secSensorEnabled);
            this.secSensorEnabled = secSensorEnabled;
            return this;
        }

        /**
         * <p>The ID of the security policy.</p>
         * <blockquote>
         * <p>This parameter takes effect only for TCPSSL listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tls_cipher_policy_1_1</p>
         */
        public Builder securityPolicyId(String securityPolicyId) {
            this.putBodyParameter("SecurityPolicyId", securityPolicyId);
            this.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * <p>The ID of the server group.</p>
         * <blockquote>
         * <ul>
         * <li>If the listener is a <strong>TCP</strong> listener, you can select a server group whose backend protocol is <strong>TCP</strong> or <strong>TCP_UDP</strong>. You cannot select a server group whose backend protocol is <strong>UDP</strong>.</li>
         * <li>If the listener is a <strong>UDP</strong> listener, you can select a server group whose backend protocol is <strong>UDP</strong> or <strong>TCP_UDP</strong>. You cannot select a server group whose backend protocol is <strong>TCP</strong>.</li>
         * <li>If the listener is a <strong>TCPSSL</strong> listener, you can select a server group whose backend protocol is <strong>TCP</strong> and for which <strong>client address preservation is disabled</strong>. You cannot select a server group whose backend protocol is <strong>TCP</strong> and for which <strong>client address preservation is enabled</strong>, or a server group whose backend protocol is <strong>UDP</strong> or <strong>TCP_UDP</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sgp-ppdpc14gdm3x4o****</p>
         */
        public Builder serverGroupId(String serverGroupId) {
            this.putBodyParameter("ServerGroupId", serverGroupId);
            this.serverGroupId = serverGroupId;
            return this;
        }

        @Override
        public UpdateListenerAttributeRequest build() {
            return new UpdateListenerAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateListenerAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateListenerAttributeRequest</p>
     */
    public static class ProxyProtocolV2Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ppv2CnIdEnabled")
        private Boolean ppv2CnIdEnabled;

        @com.aliyun.core.annotation.NameInMap("Ppv2PrivateLinkEpIdEnabled")
        private Boolean ppv2PrivateLinkEpIdEnabled;

        @com.aliyun.core.annotation.NameInMap("Ppv2PrivateLinkEpsIdEnabled")
        private Boolean ppv2PrivateLinkEpsIdEnabled;

        @com.aliyun.core.annotation.NameInMap("Ppv2VpcIdEnabled")
        private Boolean ppv2VpcIdEnabled;

        private ProxyProtocolV2Config(Builder builder) {
            this.ppv2CnIdEnabled = builder.ppv2CnIdEnabled;
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
         * @return ppv2CnIdEnabled
         */
        public Boolean getPpv2CnIdEnabled() {
            return this.ppv2CnIdEnabled;
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
            private Boolean ppv2CnIdEnabled; 
            private Boolean ppv2PrivateLinkEpIdEnabled; 
            private Boolean ppv2PrivateLinkEpsIdEnabled; 
            private Boolean ppv2VpcIdEnabled; 

            private Builder() {
            } 

            private Builder(ProxyProtocolV2Config model) {
                this.ppv2CnIdEnabled = model.ppv2CnIdEnabled;
                this.ppv2PrivateLinkEpIdEnabled = model.ppv2PrivateLinkEpIdEnabled;
                this.ppv2PrivateLinkEpsIdEnabled = model.ppv2PrivateLinkEpsIdEnabled;
                this.ppv2VpcIdEnabled = model.ppv2VpcIdEnabled;
            } 

            /**
             * <p>Specifies whether to use the Proxy Protocol to pass the CN-ID to backend servers. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: yes.</p>
             * </li>
             * <li><p><strong>false</strong>: no.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder ppv2CnIdEnabled(Boolean ppv2CnIdEnabled) {
                this.ppv2CnIdEnabled = ppv2CnIdEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the Proxy Protocol to pass the PrivateLinkEpId to backend servers. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: yes.</p>
             * </li>
             * <li><p><strong>false</strong>: no.</p>
             * </li>
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
             * <p>Specifies whether to use the Proxy Protocol to pass the PrivateLinkEpsId to backend servers. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: yes.</p>
             * </li>
             * <li><p><strong>false</strong>: no.</p>
             * </li>
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
             * <p>Specifies whether to use the Proxy Protocol to pass the VpcId to backend servers. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: yes.</p>
             * </li>
             * <li><p><strong>false</strong>: no.</p>
             * </li>
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
}
