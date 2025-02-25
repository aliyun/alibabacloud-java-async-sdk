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
    @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 10)
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
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
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
         * <li><strong>HTTP1Only</strong>: uses only HTTP 1.x. The priority of HTTP 1.1 is higher than the priority of HTTP 1.0.</li>
         * <li><strong>HTTP2Only</strong>: uses only HTTP 2.0.</li>
         * <li><strong>HTTP2Optional</strong>: preferentially uses HTTP 1.x over HTTP 2.0. The priority of HTTP 1.1 is higher than the priority of HTTP 1.0, and the priority of HTTP 1.0 is higher than the priority of HTTP 2.0.</li>
         * <li><strong>HTTP2Preferred</strong>: preferentially uses HTTP 2.0 over HTTP 1.x. The priority of HTTP 2.0 is higher than the priority of HTTP 1.1, and the priority of HTTP 1.1 is higher than the priority of HTTP 1.0.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required if AlpnEnabled is set to true.</p>
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
         * <p>The CA certificates. Only one CA certificate is supported.</p>
         * <blockquote>
         * <p> This parameter takes effect only for listeners that use SSL over TCP.</p>
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
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong> (default): no</li>
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
         * <p>The server certificates.</p>
         */
        public Builder certificateIds(java.util.List<String> certificateIds) {
            this.putBodyParameter("CertificateIds", certificateIds);
            this.certificateIds = certificateIds;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
         * <p>The maximum number of new connections per second supported by the listener in each zone (virtual IP address). Valid values: <strong>0</strong> to <strong>1000000</strong>. <strong>0</strong> indicates that the number of connections is unlimited.</p>
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
         * <p>Specifies whether only to precheck the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: prechecks the request but does not update the configurations of the listener. The system prechecks the required parameters, request syntax, and limits. If the request fails the precheck, an error message is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
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
         * <p>The timeout period of idle connections. Unit: seconds</p>
         * <ul>
         * <li>If the listener uses <strong>TCP</strong> or <strong>TCPSSL</strong>, you can set the timeout period of idle connections to <strong>10</strong> to <strong>900</strong> seconds. Default value: <strong>900</strong>.</li>
         * <li>If the listener uses <strong>UDP</strong>, you can set the timeout period of idle connections to <strong>10</strong> to <strong>20</strong> seconds. Default value: <strong>20</strong>.</li>
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
         * <p>Enter a name for the listener.</p>
         * <p>The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
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
         * <p>The ID of the listener.</p>
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
         * <p>The size of the largest TCP segment. Unit: bytes. Valid values: <strong>0</strong> to <strong>1500</strong>. <strong>0</strong> specifies that the maximum segment size remains unchanged. This parameter is supported only by listeners that use SSL over TCP.</p>
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
         * <p>Specifies whether to use the Proxy protocol to pass client IP addresses to backend servers. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
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
         * <p>Specifies that the Proxy protocol passes the VpcId, PrivateLinkEpId, and PrivateLinkEpsId parameters to backend servers.</p>
         */
        public Builder proxyProtocolV2Config(ProxyProtocolV2Config proxyProtocolV2Config) {
            String proxyProtocolV2ConfigShrink = shrink(proxyProtocolV2Config, "ProxyProtocolV2Config", "json");
            this.putBodyParameter("ProxyProtocolV2Config", proxyProtocolV2ConfigShrink);
            this.proxyProtocolV2Config = proxyProtocolV2Config;
            return this;
        }

        /**
         * <p>The ID of the region where the NLB instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>Specifies whether to enable fine-grained monitoring. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
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
         * <p> This parameter takes effect only for listeners that use SSL over TCP.</p>
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
         * <li>If you set <strong>ListenerProtocol</strong> to <strong>TCP</strong>, you can associate the listener with server groups whose backend protocol is <strong>TCP</strong> or <strong>TCP_UDP</strong>. You cannot associate the listener with server groups whose backend protocol is <strong>UDP</strong>.</li>
         * <li>If you set <strong>ListenerProtocol</strong> to <strong>UDP</strong>, you can associate the listener with server groups whose backend protocol is <strong>UDP</strong> or <strong>TCP_UDP</strong>. You cannot associate the listener with server groups whose backend protocol is <strong>TCP</strong>.</li>
         * <li>If you set <strong>ListenerProtocol</strong> to <strong>TCPSSL</strong>, you can associate the listener with server groups whose backend protocol is <strong>TCP</strong> and have <strong>client IP preservation disabled</strong>. You cannot associate the listener with server groups whose backend protocol is <strong>TCP</strong> and have <strong>client IP preservation enabled</strong> or server groups whose backend protocol is <strong>UDP</strong> or <strong>TCP_UDP</strong>.</li>
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
             * <p>Specifies whether to use the Proxy protocol to pass the PrivateLinkEpId parameter to backend servers. Valid values:</p>
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
             * <p>Specifies whether to use the Proxy protocol to pass the PrivateLinkEpsId parameter to backend servers. Valid values:</p>
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
             * <p>Specifies whether to use the Proxy protocol to pass the VpcId parameter to backend servers. Valid values:</p>
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
}
