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
 * {@link CreateListenerRequest} extends {@link RequestModel}
 *
 * <p>CreateListenerRequest</p>
 */
public class CreateListenerRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("EndPort")
    private Integer endPort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListenerDescription")
    private String listenerDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
    private Integer listenerPort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListenerProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerProtocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartPort")
    private Integer startPort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

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
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateListenerRequest, Builder> {
        private Boolean alpnEnabled; 
        private String alpnPolicy; 
        private java.util.List<String> caCertificateIds; 
        private Boolean caEnabled; 
        private java.util.List<String> certificateIds; 
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
        private java.util.List<Tag> tag; 

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
         * <p>Specifies whether to enable ALPN. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables ALPN.</p>
         * </li>
         * <li><p><strong>false</strong> (default): disables ALPN.</p>
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
         * <p>You must configure this parameter after <strong>AlpnEnabled</strong> is enabled.</p>
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
         * <p>The CA certificate list. This parameter takes effect only for TCPSSL listeners.</p>
         * <blockquote>
         * <p>Currently, you can add only one CA certificate.</p>
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
         * <p>The server certificate list. This parameter takes effect only for TCPSSL listeners.</p>
         * <blockquote>
         * <p>Currently, you can add only one server certificate.</p>
         * </blockquote>
         */
        public Builder certificateIds(java.util.List<String> certificateIds) {
            this.putBodyParameter("CertificateIds", certificateIds);
            this.certificateIds = certificateIds;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate a parameter value on your client to ensure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
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
         * <p>The limit on the number of new connections processed per second by the listener in each zone (VIP). Valid values: <strong>0</strong> to <strong>1000000</strong>. <strong>0</strong> indicates that no limit is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder cps(Integer cps) {
            this.putBodyParameter("Cps", cps);
            this.cps = cps;
            return this;
        }

        /**
         * <p>Specifies whether to only precheck the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: sends a precheck request without creating the listener. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the DryRunOperation error code is returned.</li>
         * <li><strong>false</strong> (default): sends a regular request. If the request passes the precheck, an HTTP 2xx status code is returned and the operation is performed.</li>
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
         * <p>The end port for all-port listening. Valid values: <strong>1</strong> to <strong>65535</strong>.
         * The end port must be greater than the start port.</p>
         * <blockquote>
         * <p>You must configure this parameter when <strong>ListenerPort</strong> is set to <strong>0</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>566</p>
         */
        public Builder endPort(Integer endPort) {
            this.putBodyParameter("EndPort", endPort);
            this.endPort = endPort;
            return this;
        }

        /**
         * <p>The idle timeout period for connections. Unit: seconds.</p>
         * <ul>
         * <li><p>If <strong>ListenerProtocol</strong> is set to <strong>TCP</strong> or <strong>TCPSSL</strong>, the valid values are <strong>10</strong> to <strong>900</strong>. Default value: <strong>900</strong>.</p>
         * </li>
         * <li><p>If <strong>ListenerProtocol</strong> is set to <strong>UDP</strong>, the valid values are <strong>10</strong> to <strong>90</strong>. Default value: <strong>90</strong>.</p>
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
         * <p>The custom listener name.</p>
         * <p>The name must be 2 to 256 characters in length, and can contain Chinese characters, English letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>tcp_80</p>
         */
        public Builder listenerDescription(String listenerDescription) {
            this.putBodyParameter("ListenerDescription", listenerDescription);
            this.listenerDescription = listenerDescription;
            return this;
        }

        /**
         * <p>The listener port. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p><strong>0</strong>: indicates that the all-port feature is used. If you set this parameter to <strong>0</strong>, you must configure <strong>StartPort</strong> and <strong>EndPort</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putBodyParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The listener protocol. Valid values: <strong>TCP</strong>, <strong>UDP</strong>, and <strong>TCPSSL</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder listenerProtocol(String listenerProtocol) {
            this.putBodyParameter("ListenerProtocol", listenerProtocol);
            this.listenerProtocol = listenerProtocol;
            return this;
        }

        /**
         * <p>The Network Load Balancer (NLB) instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nlb-83ckzc8d4xlp8o****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putBodyParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The maximum segment size (MSS) of TCP packets. Unit: bytes. Valid values: <strong>0</strong> to <strong>1500</strong>.
         * <strong>0</strong>: indicates that the MSS value of user TCP packets is not modified.</p>
         * <blockquote>
         * <p>This parameter is supported only by TCP and TCPSSL listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        public Builder mss(Integer mss) {
            this.putBodyParameter("Mss", mss);
            this.mss = mss;
            return this;
        }

        /**
         * <p>Specifies whether to use the Proxy Protocol to pass the client source IP address to backend servers. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the feature.</p>
         * </li>
         * <li><p><strong>false</strong> (default): disables the feature.</p>
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
         * <p>The region ID of the Network Load Balancer (NLB) instance. </p>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/443657.html">DescribeRegions</a> operation to query region IDs.</p>
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
         * <li><p><strong>false</strong> (default): disables second-level monitoring.</p>
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
         * <p>The ID of the security policy. System security policies and custom security policies are supported.</p>
         * <ul>
         * <li>System policies: <strong>tls_cipher_policy_1_0</strong> (default), <strong>tls_cipher_policy_1_1</strong>, <strong>tls_cipher_policy_1_2</strong>, <strong>tls_cipher_policy_1_2_strict</strong>, and <strong>tls_cipher_policy_1_2_strict_with_1_3</strong>.</li>
         * <li>Custom security policies: Enter the ID of a custom security policy.<ul>
         * <li>To create a custom policy, refer to <a href="https://help.aliyun.com/document_detail/445901.html">CreateSecurityPolicy</a>.</li>
         * <li>To query security policies, refer to <a href="https://help.aliyun.com/document_detail/445900.html">ListSecurityPolicy</a>.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only for TCPSSL listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>tls_cipher_policy_1_0</p>
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
         * <li>If <strong>ListenerProtocol</strong> is set to <strong>TCP</strong>, the listener supports server groups whose backend protocol is <strong>TCP</strong> or <strong>TCP_UDP</strong>, but does not support server groups whose backend protocol is <strong>UDP</strong>.</li>
         * <li>If <strong>ListenerProtocol</strong> is set to <strong>UDP</strong>, the listener supports server groups whose backend protocol is <strong>UDP</strong> or <strong>TCP_UDP</strong>, but does not support server groups whose backend protocol is <strong>TCP</strong>.</li>
         * <li>If <strong>ListenerProtocol</strong> is set to <strong>TCPSSL</strong>, the listener supports server groups whose backend protocol is <strong>TCP</strong> and for which <strong>client address preservation is disabled</strong>. It does not support server groups whose backend protocol is <strong>TCP</strong> and for which <strong>client address preservation is enabled</strong>, or server groups whose backend protocol is <strong>UDP</strong> or <strong>TCP_UDP</strong>.</li>
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

        /**
         * <p>The start port for all-port listening. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <blockquote>
         * <p>You must configure this parameter when <strong>ListenerPort</strong> is set to <strong>0</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>244</p>
         */
        public Builder startPort(Integer startPort) {
            this.putBodyParameter("StartPort", startPort);
            this.startPort = startPort;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateListenerRequest build() {
            return new CreateListenerRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
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
             * <p>Ppv2CnIdEnabled</p>
             */
            public Builder ppv2CnIdEnabled(Boolean ppv2CnIdEnabled) {
                this.ppv2CnIdEnabled = ppv2CnIdEnabled;
                return this;
            }

            /**
             * <p>Specifies whether to use the Proxy Protocol to pass the Ppv2PrivateLinkEpId to backend servers. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: enables the feature.</p>
             * </li>
             * <li><p><strong>false</strong> (default): disables the feature.</p>
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
             * <li><p><strong>true</strong>: enables the feature.</p>
             * </li>
             * <li><p><strong>false</strong> (default): disables the feature.</p>
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
             * <li><p><strong>true</strong>: enables the feature.</p>
             * </li>
             * <li><p><strong>false</strong> (default): disables the feature.</p>
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
    /**
     * 
     * {@link CreateListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateListenerRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. The key can be up to 64 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>. Supported characters include letters, digits, underscores (_), periods (.), colons (:), forward slashes (/), equal signs (=), plus signs (+), hyphens (-), and at signs (@).</p>
             * <p>You can add up to 20 tags in a single call.</p>
             * 
             * <strong>example:</strong>
             * <p>KeyTest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. The value can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>, or contain <code>http://</code> or <code>https://</code>. Supported characters include letters, digits, underscores (_), periods (.), colons (:), forward slashes (/), equal signs (=), plus signs (+), hyphens (-), and at signs (@).</p>
             * <p>You can add up to 20 tags in a single call.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
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
