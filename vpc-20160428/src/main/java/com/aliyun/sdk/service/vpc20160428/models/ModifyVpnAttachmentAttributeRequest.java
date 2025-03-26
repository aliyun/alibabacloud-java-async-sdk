// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ModifyVpnAttachmentAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpnAttachmentAttributeRequest</p>
 */
public class ModifyVpnAttachmentAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoConfigRoute")
    private Boolean autoConfigRoute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BgpConfig")
    private String bgpConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerGatewayId")
    private String customerGatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectImmediately")
    private Boolean effectImmediately;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableDpd")
    private Boolean enableDpd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableNatTraversal")
    private Boolean enableNatTraversal;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableTunnelsBgp")
    private Boolean enableTunnelsBgp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckConfig")
    private String healthCheckConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IkeConfig")
    private String ikeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpsecConfig")
    private String ipsecConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalSubnet")
    private String localSubnet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteCaCert")
    private String remoteCaCert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteSubnet")
    private String remoteSubnet;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TunnelOptionsSpecification")
    private java.util.List<TunnelOptionsSpecification> tunnelOptionsSpecification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpnConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpnConnectionId;

    private ModifyVpnAttachmentAttributeRequest(Builder builder) {
        super(builder);
        this.autoConfigRoute = builder.autoConfigRoute;
        this.bgpConfig = builder.bgpConfig;
        this.clientToken = builder.clientToken;
        this.customerGatewayId = builder.customerGatewayId;
        this.effectImmediately = builder.effectImmediately;
        this.enableDpd = builder.enableDpd;
        this.enableNatTraversal = builder.enableNatTraversal;
        this.enableTunnelsBgp = builder.enableTunnelsBgp;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.ikeConfig = builder.ikeConfig;
        this.ipsecConfig = builder.ipsecConfig;
        this.localSubnet = builder.localSubnet;
        this.name = builder.name;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.regionId = builder.regionId;
        this.remoteCaCert = builder.remoteCaCert;
        this.remoteSubnet = builder.remoteSubnet;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tunnelOptionsSpecification = builder.tunnelOptionsSpecification;
        this.vpnConnectionId = builder.vpnConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpnAttachmentAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoConfigRoute
     */
    public Boolean getAutoConfigRoute() {
        return this.autoConfigRoute;
    }

    /**
     * @return bgpConfig
     */
    public String getBgpConfig() {
        return this.bgpConfig;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return customerGatewayId
     */
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * @return effectImmediately
     */
    public Boolean getEffectImmediately() {
        return this.effectImmediately;
    }

    /**
     * @return enableDpd
     */
    public Boolean getEnableDpd() {
        return this.enableDpd;
    }

    /**
     * @return enableNatTraversal
     */
    public Boolean getEnableNatTraversal() {
        return this.enableNatTraversal;
    }

    /**
     * @return enableTunnelsBgp
     */
    public Boolean getEnableTunnelsBgp() {
        return this.enableTunnelsBgp;
    }

    /**
     * @return healthCheckConfig
     */
    public String getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * @return ikeConfig
     */
    public String getIkeConfig() {
        return this.ikeConfig;
    }

    /**
     * @return ipsecConfig
     */
    public String getIpsecConfig() {
        return this.ipsecConfig;
    }

    /**
     * @return localSubnet
     */
    public String getLocalSubnet() {
        return this.localSubnet;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remoteCaCert
     */
    public String getRemoteCaCert() {
        return this.remoteCaCert;
    }

    /**
     * @return remoteSubnet
     */
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tunnelOptionsSpecification
     */
    public java.util.List<TunnelOptionsSpecification> getTunnelOptionsSpecification() {
        return this.tunnelOptionsSpecification;
    }

    /**
     * @return vpnConnectionId
     */
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public static final class Builder extends Request.Builder<ModifyVpnAttachmentAttributeRequest, Builder> {
        private Boolean autoConfigRoute; 
        private String bgpConfig; 
        private String clientToken; 
        private String customerGatewayId; 
        private Boolean effectImmediately; 
        private Boolean enableDpd; 
        private Boolean enableNatTraversal; 
        private Boolean enableTunnelsBgp; 
        private String healthCheckConfig; 
        private String ikeConfig; 
        private String ipsecConfig; 
        private String localSubnet; 
        private String name; 
        private String networkType; 
        private String ownerAccount; 
        private String regionId; 
        private String remoteCaCert; 
        private String remoteSubnet; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<TunnelOptionsSpecification> tunnelOptionsSpecification; 
        private String vpnConnectionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpnAttachmentAttributeRequest request) {
            super(request);
            this.autoConfigRoute = request.autoConfigRoute;
            this.bgpConfig = request.bgpConfig;
            this.clientToken = request.clientToken;
            this.customerGatewayId = request.customerGatewayId;
            this.effectImmediately = request.effectImmediately;
            this.enableDpd = request.enableDpd;
            this.enableNatTraversal = request.enableNatTraversal;
            this.enableTunnelsBgp = request.enableTunnelsBgp;
            this.healthCheckConfig = request.healthCheckConfig;
            this.ikeConfig = request.ikeConfig;
            this.ipsecConfig = request.ipsecConfig;
            this.localSubnet = request.localSubnet;
            this.name = request.name;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.regionId = request.regionId;
            this.remoteCaCert = request.remoteCaCert;
            this.remoteSubnet = request.remoteSubnet;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tunnelOptionsSpecification = request.tunnelOptionsSpecification;
            this.vpnConnectionId = request.vpnConnectionId;
        } 

        /**
         * <p>Specifies whether to automatically configure routes. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoConfigRoute(Boolean autoConfigRoute) {
            this.putQueryParameter("AutoConfigRoute", autoConfigRoute);
            this.autoConfigRoute = autoConfigRoute;
            return this;
        }

        /**
         * <p>This parameter is supported if you modify the configurations of an IPsec-VPN connection in single-tunnel mode.</p>
         * <p>BGP configuration:</p>
         * <ul>
         * <li><p><strong>BgpConfig.EnableBgp</strong>: specifies whether to enable BGP. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>BgpConfig.LocalAsn</strong>: the autonomous system number (ASN) on the Alibaba Cloud side. Valid values: <strong>1</strong> to <strong>4294967295</strong>.</p>
         * <p>You can enter a value in two segments separated by a period (.). Each segment is 16 bits in length. Enter the number in each segment in decimal format.</p>
         * <p>For example, if you enter 123.456, the ASN is 8061384. The ASN is calculated by using the following formula: 123 × 65536 + 456 = 8061384.</p>
         * </li>
         * <li><p><strong>BgpConfig.TunnelCidr</strong>: The CIDR block of the IPsec tunnel. The CIDR block must fall into 169.254.0.0/16 and the mask of the CIDR block must be 30 bits in length. The CIDR block cannot be 169.254.0.0/30, 169.254.1.0/30, 169.254.2.0/30, 169.254.3.0/30, 169.254.4.0/30, 169.254.5.0/30, 169.254.6.0/30, or 169.254.169.252/30.</p>
         * </li>
         * <li><p><strong>LocalBgpIp</strong>: the BGP address on the Alibaba Cloud side. It must be an IP address that falls within the CIDR block of the IPsec tunnel.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Before you add BGP configurations, we recommend that you learn about how BGP works and the limits. For more information, see <a href="https://help.aliyun.com/document_detail/445767.html">Configure BGP dynamic routing</a>.</li>
         * <li>We recommend that you use a private ASN to establish BGP connections to Alibaba Cloud. Refer to the relevant documentation for the private ASN range.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EnableBgp&quot;:&quot;true&quot;,&quot;LocalAsn&quot;:&quot;45104&quot;,&quot;TunnelCidr&quot;:&quot;169.254.11.0/30&quot;,&quot;LocalBgpIp&quot;:&quot;169.254.11.1&quot;}</p>
         */
        public Builder bgpConfig(String bgpConfig) {
            this.putQueryParameter("BgpConfig", bgpConfig);
            this.bgpConfig = bgpConfig;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the value of <strong>RequestId</strong> as the value of <strong>ClientToken</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-4266****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The customer gateways to be associated with the IPsec-VPN connections.</p>
         * <blockquote>
         * <p> Only single-tunnel IPsec-VPN connections support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cgw-p0w2jemrcj5u61un8****</p>
         */
        public Builder customerGatewayId(String customerGatewayId) {
            this.putQueryParameter("CustomerGatewayId", customerGatewayId);
            this.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * <p>Specifies whether to immediately start IPsec negotiations after the configuration takes effect. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: immediately starts IPsec negotiations after the configuration is complete.</li>
         * <li><strong>false</strong>: starts IPsec negotiations when inbound traffic is detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder effectImmediately(Boolean effectImmediately) {
            this.putQueryParameter("EffectImmediately", effectImmediately);
            this.effectImmediately = effectImmediately;
            return this;
        }

        /**
         * <p>This parameter is supported if you modify the configurations of an IPsec-VPN connection in single-tunnel mode.</p>
         * <p>Specifies whether to enable dead peer detection (DPD). Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables DPD. The initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no feedback is received from the peer within the specified period of time, the connection fails. In this case, ISAKMP SA and IPsec SA are deleted, along with the security tunnel.</li>
         * <li><strong>false</strong>: disables DPD. The initiator of the IPsec-VPN connection does not send DPD packets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableDpd(Boolean enableDpd) {
            this.putQueryParameter("EnableDpd", enableDpd);
            this.enableDpd = enableDpd;
            return this;
        }

        /**
         * <p>This parameter is supported if you modify the configurations of an IPsec-VPN connection in single-tunnel mode.</p>
         * <p>Specifies whether to enable NAT traversal. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables NAT traversal. After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the IPsec-VPN tunnel.</li>
         * <li><strong>false</strong>: disables NAT traversal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableNatTraversal(Boolean enableNatTraversal) {
            this.putQueryParameter("EnableNatTraversal", enableNatTraversal);
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }

        /**
         * <p>You can specify this parameter if you modify the configuration of a dual-tunnel IPsec-VPN connection.</p>
         * <p>Specifies whether to enable the BGP feature for the tunnel. Valid values: <strong>true</strong> and <strong>false</strong>.</p>
         * <blockquote>
         * <p> Before you add BGP configurations, we recommend that you learn about how BGP works and the limits. For more information, see <a href="https://help.aliyun.com/document_detail/445767.html">Configure BGP dynamic routing</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableTunnelsBgp(Boolean enableTunnelsBgp) {
            this.putQueryParameter("EnableTunnelsBgp", enableTunnelsBgp);
            this.enableTunnelsBgp = enableTunnelsBgp;
            return this;
        }

        /**
         * <p>This parameter is supported if you modify the configurations of an IPsec-VPN connection in single-tunnel mode.</p>
         * <p>The health check configurations:</p>
         * <ul>
         * <li><p><strong>HealthCheckConfig.enable</strong>: specifies whether to enable the health check feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>HealthCheckConfig.dip</strong>: the destination IP address configured for health checks. Specify the IP address of the data center with which the VPC can access through the IPsec-VPN connection.</p>
         * </li>
         * <li><p><strong>HealthCheckConfig.sip</strong>: the source IP address configured for health checks. The IP address of the VPC with which the data center can access through the IPsec-VPN connection.</p>
         * </li>
         * <li><p><strong>HealthCheckConfig.interval</strong>: the interval between two consecutive health checks. Unit: seconds.</p>
         * </li>
         * <li><p><strong>HealthCheckConfig.retry:</strong> the maximum number of health check retries.</p>
         * </li>
         * <li><p><strong>HealthCheckConfig.Policy</strong>: specifies whether to withdraw advertised routes when health checks fail. Valid values:</p>
         * <ul>
         * <li><strong>revoke_route</strong></li>
         * <li><strong>reserve_route</strong></li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enable&quot;:&quot;true&quot;,&quot;dip&quot;:&quot;192.168.1.1&quot;,&quot;sip&quot;:&quot;10.1.1.1&quot;,&quot;interval&quot;:&quot;3&quot;,&quot;retry&quot;:&quot;3&quot;,&quot;Policy&quot;: &quot;revoke_route&quot;}</p>
         */
        public Builder healthCheckConfig(String healthCheckConfig) {
            this.putQueryParameter("HealthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * <p>This parameter is supported if you modify the configurations of an IPsec-VPN connection in single-tunnel mode.</p>
         * <p>The configuration of Phase 1 negotiations:</p>
         * <ul>
         * <li><p><strong>IkeConfig.Psk</strong>: The pre-shared key that is used for identity authentication between the Alibaba Cloud IPsec connection and the on-premises data center.</p>
         * <ul>
         * <li>The key must be 1 to 100 characters in length, and can contain digits, and letters. The key cannot contain spaces. <code>~!`@#$%^&amp;*()_-+={}[]|;:\&quot;,.&lt;&gt;/?</code></li>
         * <li>If you do not specify a pre-shared key, the system randomly generates a 16-bit string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/120374.html">DescribeVpnConnection</a> operation to query the pre-shared key that is automatically generated by the system.</li>
         * </ul>
         * <blockquote>
         * <p>The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the on-premises data center. Otherwise, connections between the on-premises data center and the VPN gateway cannot be established.</p>
         * </blockquote>
         * </li>
         * <li><p><strong>IkeConfig.IkeVersion</strong>: the version of the Internet Key Exchange (IKE) protocol. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>.</p>
         * </li>
         * <li><p><strong>IkeConfig.IkeMode</strong>: the negotiation mode. Valid values: <strong>main</strong> and <strong>aggressive</strong>.</p>
         * </li>
         * <li><p><strong>IkeConfig.IkeEncAlg:</strong> the encryption algorithm that is used in Phase 1 negotiations. Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>.</p>
         * </li>
         * <li><p><strong>IkeConfig.IkeAuthAlg</strong>: the authentication algorithm that is used in Phase 1 negotiations. Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>.</p>
         * </li>
         * <li><p><strong>IkeConfig.IkePfs</strong>: the Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiations. Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
         * </li>
         * <li><p><strong>IkeConfig.IkeLifetime</strong>: the SA lifetime as a result of Phase 1 negotiations. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>.</p>
         * </li>
         * <li><p><strong>IkeConfig.LocalId</strong>: the identifier on the Alibaba Cloud side. The identifier cannot exceed 100 characters in length and cannot contain spaces.</p>
         * </li>
         * <li><p><strong>IkeConfig.RemoteId</strong>: the identifier of the data center. It cannot exceed 100 characters in length and cannot contain spaces.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Psk&quot;:&quot;1234****&quot;,&quot;IkeVersion&quot;:&quot;ikev1&quot;,&quot;IkeMode&quot;:&quot;main&quot;,&quot;IkeEncAlg&quot;:&quot;aes&quot;,&quot;IkeAuthAlg&quot;:&quot;sha1&quot;,&quot;IkePfs&quot;:&quot;group2&quot;,&quot;IkeLifetime&quot;:86400,&quot;LocalId&quot;:&quot;47.XX.XX.1&quot;,&quot;RemoteId&quot;:&quot;47.XX.XX.2&quot;}</p>
         */
        public Builder ikeConfig(String ikeConfig) {
            this.putQueryParameter("IkeConfig", ikeConfig);
            this.ikeConfig = ikeConfig;
            return this;
        }

        /**
         * <p>This parameter is supported if you modify the configurations of an IPsec-VPN connection in single-tunnel mode.</p>
         * <p>The configuration of Phase 2 negotiations:</p>
         * <ul>
         * <li><strong>IpsecConfig.IpsecEncAlg:</strong> the encryption algorithm that is used in Phase 2 negotiations. Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>.</li>
         * <li><strong>IpsecConfig. IpsecAuthAlg:</strong> the authentication algorithm that is used in Phase 2 negotiations. Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>.</li>
         * <li><strong>IpsecConfig. IpsecPfs:</strong> the Diffie-Hellman key exchange algorithm that is used in Phase 2 negotiations. Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</li>
         * <li><strong>IkeConfig.IkeLifetime</strong>: the SA lifetime determined by Phase 2 negotiations. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;IpsecEncAlg&quot;:&quot;aes&quot;,&quot;IpsecAuthAlg&quot;:&quot;sha1&quot;,&quot;IpsecPfs&quot;:&quot;group2&quot;,&quot;IpsecLifetime&quot;:86400}</p>
         */
        public Builder ipsecConfig(String ipsecConfig) {
            this.putQueryParameter("IpsecConfig", ipsecConfig);
            this.ipsecConfig = ipsecConfig;
            return this;
        }

        /**
         * <p>The CIDR block of the virtual private cloud (VPC) that communicates with the data center. The CIDR block is used in Phase 2 negotiations.</p>
         * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
         * <p>The following routing modes are supported:</p>
         * <ul>
         * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to 0.0.0.0/0, the routing mode of the IPsec-VPN connection is set to Destination Routing Mode.</li>
         * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to specific CIDR blocks, the routing mode of the IPsec-VPN connection is set to Protected Data Flows.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.1.1.0/24,10.1.2.0/24</p>
         */
        public Builder localSubnet(String localSubnet) {
            this.putQueryParameter("LocalSubnet", localSubnet);
            this.localSubnet = localSubnet;
            return this;
        }

        /**
         * <p>The name of the IPsec-VPN connection.</p>
         * <p>The name must be 1 to 100 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The network type of the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>public</strong>: an encrypted connection over the Internet</li>
         * <li><strong>private</strong>: an encrypted connection over private networks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * <p>The ID of the region in which the IPsec-VPN connection is established.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The peer CA certificate when a ShangMi (SM) VPN gateway is used to create the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>c20ycDI1NnYxIENBIChURVNUIFN****</p>
         */
        public Builder remoteCaCert(String remoteCaCert) {
            this.putQueryParameter("RemoteCaCert", remoteCaCert);
            this.remoteCaCert = remoteCaCert;
            return this;
        }

        /**
         * <p>The CIDR block of the data center that communicates with the VPC. This CIDR block is used in Phase 2 negotiations.</p>
         * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.3.0/24,192.168.4.0/24.</p>
         * <p>The following routing modes are supported:</p>
         * <ul>
         * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to 0.0.0.0/0, the routing mode of the IPsec-VPN connection is set to Destination Routing Mode.</li>
         * <li>If you set <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> to specific CIDR blocks, the routing mode of the IPsec-VPN connection is set to Protected Data Flows.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.1.3.0/24,10.1.4.0/24</p>
         */
        public Builder remoteSubnet(String remoteSubnet) {
            this.putQueryParameter("RemoteSubnet", remoteSubnet);
            this.remoteSubnet = remoteSubnet;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The tunnel configurations.</p>
         * <p>You can specify parameters in the <strong>TunnelOptionsSpecification</strong> array when you modify the configurations of an IPsec-VPN connection in dual-tunnel mode. You can modify the configurations of the two tunnels of the IPsec-VPN connection.</p>
         */
        public Builder tunnelOptionsSpecification(java.util.List<TunnelOptionsSpecification> tunnelOptionsSpecification) {
            this.putBodyParameter("TunnelOptionsSpecification", tunnelOptionsSpecification);
            this.tunnelOptionsSpecification = tunnelOptionsSpecification;
            return this;
        }

        /**
         * <p>The ID of the IPsec-VPN connection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-p0w5112fgnl2ihlmf****</p>
         */
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.putQueryParameter("VpnConnectionId", vpnConnectionId);
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }

        @Override
        public ModifyVpnAttachmentAttributeRequest build() {
            return new ModifyVpnAttachmentAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyVpnAttachmentAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyVpnAttachmentAttributeRequest</p>
     */
    public static class TunnelBgpConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalAsn")
        private Long localAsn;

        @com.aliyun.core.annotation.NameInMap("LocalBgpIp")
        private String localBgpIp;

        @com.aliyun.core.annotation.NameInMap("TunnelCidr")
        private String tunnelCidr;

        private TunnelBgpConfig(Builder builder) {
            this.localAsn = builder.localAsn;
            this.localBgpIp = builder.localBgpIp;
            this.tunnelCidr = builder.tunnelCidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelBgpConfig create() {
            return builder().build();
        }

        /**
         * @return localAsn
         */
        public Long getLocalAsn() {
            return this.localAsn;
        }

        /**
         * @return localBgpIp
         */
        public String getLocalBgpIp() {
            return this.localBgpIp;
        }

        /**
         * @return tunnelCidr
         */
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

        public static final class Builder {
            private Long localAsn; 
            private String localBgpIp; 
            private String tunnelCidr; 

            private Builder() {
            } 

            private Builder(TunnelBgpConfig model) {
                this.localAsn = model.localAsn;
                this.localBgpIp = model.localBgpIp;
                this.tunnelCidr = model.tunnelCidr;
            } 

            /**
             * <p>The autonomous system number (ASN) of the tunnel on the Alibaba Cloud side. Valid values: <strong>1</strong> to <strong>4294967295</strong>. Default value: <strong>45104</strong>.</p>
             * <blockquote>
             * <p> We recommend that you use a private ASN to establish BGP connections to Alibaba Cloud. Refer to the relevant documentation for the private ASN range.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>65530</p>
             */
            public Builder localAsn(Long localAsn) {
                this.localAsn = localAsn;
                return this;
            }

            /**
             * <p>The BGP IP address of the tunnel on the Alibaba Cloud side. The address is an IP address that falls within the BGP CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.10.1</p>
             */
            public Builder localBgpIp(String localBgpIp) {
                this.localBgpIp = localBgpIp;
                return this;
            }

            /**
             * <p>The BGP CIDR block of the tunnel. The CIDR block must fall within 169.254.0.0/16 and the mask of the CIDR block must be 30 bits in length. The CIDR block cannot be 169.254.0.0/30, 169.254.1.0/30, 169.254.2.0/30, 169.254.3.0/30, 169.254.4.0/30, 169.254.5.0/30, 169.254.6.0/30, or 169.254.169.252/30.</p>
             * <blockquote>
             * <p> The two tunnels of an IPsec connection must use different CIDR blocks.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>169.254.10.0/30</p>
             */
            public Builder tunnelCidr(String tunnelCidr) {
                this.tunnelCidr = tunnelCidr;
                return this;
            }

            public TunnelBgpConfig build() {
                return new TunnelBgpConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyVpnAttachmentAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyVpnAttachmentAttributeRequest</p>
     */
    public static class TunnelIkeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IkeAuthAlg")
        private String ikeAuthAlg;

        @com.aliyun.core.annotation.NameInMap("IkeEncAlg")
        private String ikeEncAlg;

        @com.aliyun.core.annotation.NameInMap("IkeLifetime")
        private Long ikeLifetime;

        @com.aliyun.core.annotation.NameInMap("IkeMode")
        private String ikeMode;

        @com.aliyun.core.annotation.NameInMap("IkePfs")
        private String ikePfs;

        @com.aliyun.core.annotation.NameInMap("IkeVersion")
        private String ikeVersion;

        @com.aliyun.core.annotation.NameInMap("LocalId")
        private String localId;

        @com.aliyun.core.annotation.NameInMap("Psk")
        private String psk;

        @com.aliyun.core.annotation.NameInMap("RemoteId")
        private String remoteId;

        private TunnelIkeConfig(Builder builder) {
            this.ikeAuthAlg = builder.ikeAuthAlg;
            this.ikeEncAlg = builder.ikeEncAlg;
            this.ikeLifetime = builder.ikeLifetime;
            this.ikeMode = builder.ikeMode;
            this.ikePfs = builder.ikePfs;
            this.ikeVersion = builder.ikeVersion;
            this.localId = builder.localId;
            this.psk = builder.psk;
            this.remoteId = builder.remoteId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelIkeConfig create() {
            return builder().build();
        }

        /**
         * @return ikeAuthAlg
         */
        public String getIkeAuthAlg() {
            return this.ikeAuthAlg;
        }

        /**
         * @return ikeEncAlg
         */
        public String getIkeEncAlg() {
            return this.ikeEncAlg;
        }

        /**
         * @return ikeLifetime
         */
        public Long getIkeLifetime() {
            return this.ikeLifetime;
        }

        /**
         * @return ikeMode
         */
        public String getIkeMode() {
            return this.ikeMode;
        }

        /**
         * @return ikePfs
         */
        public String getIkePfs() {
            return this.ikePfs;
        }

        /**
         * @return ikeVersion
         */
        public String getIkeVersion() {
            return this.ikeVersion;
        }

        /**
         * @return localId
         */
        public String getLocalId() {
            return this.localId;
        }

        /**
         * @return psk
         */
        public String getPsk() {
            return this.psk;
        }

        /**
         * @return remoteId
         */
        public String getRemoteId() {
            return this.remoteId;
        }

        public static final class Builder {
            private String ikeAuthAlg; 
            private String ikeEncAlg; 
            private Long ikeLifetime; 
            private String ikeMode; 
            private String ikePfs; 
            private String ikeVersion; 
            private String localId; 
            private String psk; 
            private String remoteId; 

            private Builder() {
            } 

            private Builder(TunnelIkeConfig model) {
                this.ikeAuthAlg = model.ikeAuthAlg;
                this.ikeEncAlg = model.ikeEncAlg;
                this.ikeLifetime = model.ikeLifetime;
                this.ikeMode = model.ikeMode;
                this.ikePfs = model.ikePfs;
                this.ikeVersion = model.ikeVersion;
                this.localId = model.localId;
                this.psk = model.psk;
                this.remoteId = model.remoteId;
            } 

            /**
             * <p>The authentication algorithm that is used in Phase 1 negotiations. Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm that is used in Phase 1 negotiations. Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * <p>The SA lifetime as a result of Phase 1 negotiations. Unit: seconds.</p>
             * <p>Valid values: <strong>0</strong> to <strong>86400</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ikeLifetime(Long ikeLifetime) {
                this.ikeLifetime = ikeLifetime;
                return this;
            }

            /**
             * <p>The negotiation mode of IKE. Valid values: <strong>main</strong> and <strong>aggressive</strong>.</p>
             * <ul>
             * <li><strong>main:</strong> This mode offers higher security during negotiations.</li>
             * <li><strong>aggressive</strong>: This mode is faster with a higher success rate.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder ikeMode(String ikeMode) {
                this.ikeMode = ikeMode;
                return this;
            }

            /**
             * <p>The Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiations. Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>group2</p>
             */
            public Builder ikePfs(String ikePfs) {
                this.ikePfs = ikePfs;
                return this;
            }

            /**
             * <p>The version of the IKE protocol. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>.</p>
             * <p>Compared with IKEv1, IKEv2 simplifies the SA negotiation process and provides better support for scenarios with multiple CIDR blocks.</p>
             * 
             * <strong>example:</strong>
             * <p>ikev2</p>
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * <p>The identifier of the tunnel on the Alibaba Cloud side, which is used in Phase 1 negotiations. The identifier cannot exceed 100 characters in length and cannot contain spaces.</p>
             * <p><strong>LocalId</strong> supports fully qualified domain names (FQDNs). If you use an FQDN, we recommend that you set the negotiation mode to <strong>aggressive</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>47.XX.XX.1</p>
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * <p>The pre-shared key that is used for identity authentication between the tunnel and the tunnel peer.</p>
             * <ul>
             * <li>The key must be 1 to 100 characters in length, and can contain digits, and letters. The key cannot contain spaces. <code>~!\`@#$%^&amp;*()_-+={}[]|;:\&quot;,.&lt;&gt;/?</code></li>
             * <li>If you do not specify a pre-shared key, the system randomly generates a 16-bit string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/2526939.html">DescribeVpnAttachments</a> operation to query the pre-shared key that is automatically generated by the system.</li>
             * </ul>
             * <blockquote>
             * <p> The tunnel and the tunnel peer must use the same pre-shared key. Otherwise, the tunnel cannot be established.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>123456****</p>
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * <p>The identifier of the tunnel peer, which is used in Phase 1 negotiations. The identifier cannot exceed 100 characters in length and cannot contain spaces.</p>
             * <p><strong>RemoteId</strong> supports FQDNs. If you use an FQDN, we recommend that you set the negotiation mode to <strong>aggressive</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>47.XX.XX.2</p>
             */
            public Builder remoteId(String remoteId) {
                this.remoteId = remoteId;
                return this;
            }

            public TunnelIkeConfig build() {
                return new TunnelIkeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyVpnAttachmentAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyVpnAttachmentAttributeRequest</p>
     */
    public static class TunnelIpsecConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpsecAuthAlg")
        private String ipsecAuthAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecEncAlg")
        private String ipsecEncAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecLifetime")
        private Integer ipsecLifetime;

        @com.aliyun.core.annotation.NameInMap("IpsecPfs")
        private String ipsecPfs;

        private TunnelIpsecConfig(Builder builder) {
            this.ipsecAuthAlg = builder.ipsecAuthAlg;
            this.ipsecEncAlg = builder.ipsecEncAlg;
            this.ipsecLifetime = builder.ipsecLifetime;
            this.ipsecPfs = builder.ipsecPfs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelIpsecConfig create() {
            return builder().build();
        }

        /**
         * @return ipsecAuthAlg
         */
        public String getIpsecAuthAlg() {
            return this.ipsecAuthAlg;
        }

        /**
         * @return ipsecEncAlg
         */
        public String getIpsecEncAlg() {
            return this.ipsecEncAlg;
        }

        /**
         * @return ipsecLifetime
         */
        public Integer getIpsecLifetime() {
            return this.ipsecLifetime;
        }

        /**
         * @return ipsecPfs
         */
        public String getIpsecPfs() {
            return this.ipsecPfs;
        }

        public static final class Builder {
            private String ipsecAuthAlg; 
            private String ipsecEncAlg; 
            private Integer ipsecLifetime; 
            private String ipsecPfs; 

            private Builder() {
            } 

            private Builder(TunnelIpsecConfig model) {
                this.ipsecAuthAlg = model.ipsecAuthAlg;
                this.ipsecEncAlg = model.ipsecEncAlg;
                this.ipsecLifetime = model.ipsecLifetime;
                this.ipsecPfs = model.ipsecPfs;
            } 

            /**
             * <p>The authentication algorithm that is used in Phase 2 negotiations.</p>
             * <p>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, and <strong>sha512</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm that is used in Phase 2 negotiations. Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, and <strong>3des</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * <p>The SA lifetime as a result of Phase 2 negotiations. Unit: seconds.</p>
             * <p>Valid values: <strong>0</strong> to <strong>86400</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ipsecLifetime(Integer ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * <p>The Diffie-Hellman key exchange algorithm that is used in Phase 2 negotiations.</p>
             * <p>Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>group2</p>
             */
            public Builder ipsecPfs(String ipsecPfs) {
                this.ipsecPfs = ipsecPfs;
                return this;
            }

            public TunnelIpsecConfig build() {
                return new TunnelIpsecConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyVpnAttachmentAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyVpnAttachmentAttributeRequest</p>
     */
    public static class TunnelOptionsSpecification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerGatewayId")
        private String customerGatewayId;

        @com.aliyun.core.annotation.NameInMap("EnableDpd")
        private Boolean enableDpd;

        @com.aliyun.core.annotation.NameInMap("EnableNatTraversal")
        private Boolean enableNatTraversal;

        @com.aliyun.core.annotation.NameInMap("TunnelBgpConfig")
        private TunnelBgpConfig tunnelBgpConfig;

        @com.aliyun.core.annotation.NameInMap("TunnelId")
        private String tunnelId;

        @com.aliyun.core.annotation.NameInMap("TunnelIkeConfig")
        private TunnelIkeConfig tunnelIkeConfig;

        @com.aliyun.core.annotation.NameInMap("TunnelIndex")
        private Integer tunnelIndex;

        @com.aliyun.core.annotation.NameInMap("TunnelIpsecConfig")
        private TunnelIpsecConfig tunnelIpsecConfig;

        private TunnelOptionsSpecification(Builder builder) {
            this.customerGatewayId = builder.customerGatewayId;
            this.enableDpd = builder.enableDpd;
            this.enableNatTraversal = builder.enableNatTraversal;
            this.tunnelBgpConfig = builder.tunnelBgpConfig;
            this.tunnelId = builder.tunnelId;
            this.tunnelIkeConfig = builder.tunnelIkeConfig;
            this.tunnelIndex = builder.tunnelIndex;
            this.tunnelIpsecConfig = builder.tunnelIpsecConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelOptionsSpecification create() {
            return builder().build();
        }

        /**
         * @return customerGatewayId
         */
        public String getCustomerGatewayId() {
            return this.customerGatewayId;
        }

        /**
         * @return enableDpd
         */
        public Boolean getEnableDpd() {
            return this.enableDpd;
        }

        /**
         * @return enableNatTraversal
         */
        public Boolean getEnableNatTraversal() {
            return this.enableNatTraversal;
        }

        /**
         * @return tunnelBgpConfig
         */
        public TunnelBgpConfig getTunnelBgpConfig() {
            return this.tunnelBgpConfig;
        }

        /**
         * @return tunnelId
         */
        public String getTunnelId() {
            return this.tunnelId;
        }

        /**
         * @return tunnelIkeConfig
         */
        public TunnelIkeConfig getTunnelIkeConfig() {
            return this.tunnelIkeConfig;
        }

        /**
         * @return tunnelIndex
         */
        public Integer getTunnelIndex() {
            return this.tunnelIndex;
        }

        /**
         * @return tunnelIpsecConfig
         */
        public TunnelIpsecConfig getTunnelIpsecConfig() {
            return this.tunnelIpsecConfig;
        }

        public static final class Builder {
            private String customerGatewayId; 
            private Boolean enableDpd; 
            private Boolean enableNatTraversal; 
            private TunnelBgpConfig tunnelBgpConfig; 
            private String tunnelId; 
            private TunnelIkeConfig tunnelIkeConfig; 
            private Integer tunnelIndex; 
            private TunnelIpsecConfig tunnelIpsecConfig; 

            private Builder() {
            } 

            private Builder(TunnelOptionsSpecification model) {
                this.customerGatewayId = model.customerGatewayId;
                this.enableDpd = model.enableDpd;
                this.enableNatTraversal = model.enableNatTraversal;
                this.tunnelBgpConfig = model.tunnelBgpConfig;
                this.tunnelId = model.tunnelId;
                this.tunnelIkeConfig = model.tunnelIkeConfig;
                this.tunnelIndex = model.tunnelIndex;
                this.tunnelIpsecConfig = model.tunnelIpsecConfig;
            } 

            /**
             * <p>The ID of the customer gateway that is associated with the tunnel.</p>
             * <blockquote>
             * <p> This parameter is only supported in dual-tunnel IPsec-VPN connections.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cgw-p0w2jemrcj5u61un8****</p>
             */
            public Builder customerGatewayId(String customerGatewayId) {
                this.customerGatewayId = customerGatewayId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the Dead Peer Detection (DPD) feature for the tunnel. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables DPD. The initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no feedback is received from the peer within the specified period of time, the connection fails. In this case, ISAKMP SA and IPsec SA are deleted along with the security tunnel.</li>
             * <li><strong>false</strong>: disables DPD. The initiator of the IPsec-VPN connection does not send DPD packets.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableDpd(Boolean enableDpd) {
                this.enableDpd = enableDpd;
                return this;
            }

            /**
             * <p>Specifies whether to enable NAT traversal for the tunnel. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables NAT traversal. After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the IPsec-VPN tunnel.</li>
             * <li><strong>false</strong>: disables NAT traversal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableNatTraversal(Boolean enableNatTraversal) {
                this.enableNatTraversal = enableNatTraversal;
                return this;
            }

            /**
             * <p>Add BGP configurations for the tunnel.</p>
             * <blockquote>
             * <p> If you enable BGP for an IPsec-VPN connection, you must set <strong>EnableTunnelsBgp</strong> parameter to <strong>true</strong>.</p>
             * </blockquote>
             */
            public Builder tunnelBgpConfig(TunnelBgpConfig tunnelBgpConfig) {
                this.tunnelBgpConfig = tunnelBgpConfig;
                return this;
            }

            /**
             * <p>The tunnel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tun-0jod7plwf2a0o9lvu****</p>
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * <p>The configuration of Phase 1 negotiations.</p>
             */
            public Builder tunnelIkeConfig(TunnelIkeConfig tunnelIkeConfig) {
                this.tunnelIkeConfig = tunnelIkeConfig;
                return this;
            }

            /**
             * <p>The order in which the tunnel was created.</p>
             * <ul>
             * <li><strong>1</strong>: Tunnel 1.</li>
             * <li><strong>2</strong>: Tunnel 2.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder tunnelIndex(Integer tunnelIndex) {
                this.tunnelIndex = tunnelIndex;
                return this;
            }

            /**
             * <p>The configuration of Phase 2 negotiations.</p>
             */
            public Builder tunnelIpsecConfig(TunnelIpsecConfig tunnelIpsecConfig) {
                this.tunnelIpsecConfig = tunnelIpsecConfig;
                return this;
            }

            public TunnelOptionsSpecification build() {
                return new TunnelOptionsSpecification(this);
            } 

        } 

    }
}
