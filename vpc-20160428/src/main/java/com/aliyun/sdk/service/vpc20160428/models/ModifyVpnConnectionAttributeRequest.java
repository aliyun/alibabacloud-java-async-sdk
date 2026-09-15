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
 * {@link ModifyVpnConnectionAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyVpnConnectionAttributeRequest</p>
 */
public class ModifyVpnConnectionAttributeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoteCaCertificate")
    private String remoteCaCertificate;

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

    private ModifyVpnConnectionAttributeRequest(Builder builder) {
        super(builder);
        this.autoConfigRoute = builder.autoConfigRoute;
        this.bgpConfig = builder.bgpConfig;
        this.clientToken = builder.clientToken;
        this.effectImmediately = builder.effectImmediately;
        this.enableDpd = builder.enableDpd;
        this.enableNatTraversal = builder.enableNatTraversal;
        this.enableTunnelsBgp = builder.enableTunnelsBgp;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.ikeConfig = builder.ikeConfig;
        this.ipsecConfig = builder.ipsecConfig;
        this.localSubnet = builder.localSubnet;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.remoteCaCertificate = builder.remoteCaCertificate;
        this.remoteSubnet = builder.remoteSubnet;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tunnelOptionsSpecification = builder.tunnelOptionsSpecification;
        this.vpnConnectionId = builder.vpnConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpnConnectionAttributeRequest create() {
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remoteCaCertificate
     */
    public String getRemoteCaCertificate() {
        return this.remoteCaCertificate;
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

    public static final class Builder extends Request.Builder<ModifyVpnConnectionAttributeRequest, Builder> {
        private Boolean autoConfigRoute; 
        private String bgpConfig; 
        private String clientToken; 
        private Boolean effectImmediately; 
        private Boolean enableDpd; 
        private Boolean enableNatTraversal; 
        private Boolean enableTunnelsBgp; 
        private String healthCheckConfig; 
        private String ikeConfig; 
        private String ipsecConfig; 
        private String localSubnet; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String remoteCaCertificate; 
        private String remoteSubnet; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List<TunnelOptionsSpecification> tunnelOptionsSpecification; 
        private String vpnConnectionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVpnConnectionAttributeRequest request) {
            super(request);
            this.autoConfigRoute = request.autoConfigRoute;
            this.bgpConfig = request.bgpConfig;
            this.clientToken = request.clientToken;
            this.effectImmediately = request.effectImmediately;
            this.enableDpd = request.enableDpd;
            this.enableNatTraversal = request.enableNatTraversal;
            this.enableTunnelsBgp = request.enableTunnelsBgp;
            this.healthCheckConfig = request.healthCheckConfig;
            this.ikeConfig = request.ikeConfig;
            this.ipsecConfig = request.ipsecConfig;
            this.localSubnet = request.localSubnet;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.remoteCaCertificate = request.remoteCaCertificate;
            this.remoteSubnet = request.remoteSubnet;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tunnelOptionsSpecification = request.tunnelOptionsSpecification;
            this.vpnConnectionId = request.vpnConnectionId;
        } 

        /**
         * <p>Specifies whether to automatically publish routes. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: automatically publishes routes.</p>
         * </li>
         * <li><p><strong>false</strong>: does not automatically publish routes.</p>
         * </li>
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
         * <p>This parameter is supported when you modify a single-tunnel mode IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EnableBgp&quot;:&quot;true&quot;,&quot;LocalAsn&quot;:&quot;65530&quot;,&quot;TunnelCidr&quot;:&quot;169.254.11.0/30&quot;,&quot;LocalBgpIp&quot;:&quot;169.254.11.1&quot;}</p>
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
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether the configuration of the IPsec-VPN connection takes effect immediately. Valid values:</p>
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
         * <p>This parameter is supported when you modify a single-tunnel IPsec-VPN connection.</p>
         * <p>Specifies whether to enable the Dead Peer Detection (DPD) feature. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enables the DPD feature. The IPsec initiator sends DPD packets to check whether the peer device is alive. If no correct response is received within the specified period of time, the peer is considered disconnected. The ISAKMP SA and the corresponding IPsec SA are deleted, and the security tunnel is also deleted.</p>
         * </li>
         * <li><p><strong>false</strong>: Disables the DPD feature. The IPsec initiator does not send DPD probe packets.</p>
         * </li>
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
         * <p>This parameter is supported when you modify an IPsec-VPN connection in single-tunnel mode.</p>
         * <p>Specifies whether to enable NAT traversal. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables NAT traversal. After NAT traversal is enabled, the IKE negotiation process skips UDP port number verification and can discover NAT gateway devices in the VPN tunnel.</p>
         * </li>
         * <li><p><strong>false</strong>: disables NAT traversal.</p>
         * </li>
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
         * <p>This parameter is supported when you modify a dual-tunnel IPsec-VPN connection.</p>
         * <p>Specifies whether to enable BGP for the tunnel. Valid values: <strong>true</strong> or <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableTunnelsBgp(Boolean enableTunnelsBgp) {
            this.putQueryParameter("EnableTunnelsBgp", enableTunnelsBgp);
            this.enableTunnelsBgp = enableTunnelsBgp;
            return this;
        }

        /**
         * <p>This parameter is supported when you modify a single-tunnel mode IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enable&quot;:&quot;true&quot;,&quot;dip&quot;:&quot;192.168.1.1&quot;,&quot;sip&quot;:&quot;10.1.1.1&quot;,&quot;interval&quot;:&quot;3&quot;,&quot;retry&quot;:&quot;3&quot;}</p>
         */
        public Builder healthCheckConfig(String healthCheckConfig) {
            this.putQueryParameter("HealthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * <p>This parameter is supported when you modify an IPsec-VPN connection in single-tunnel mode.</p>
         * <p>The configuration of Phase 1 negotiation:</p>
         * <ul>
         * <li><p><strong>IkeConfig.Psk</strong>: The pre-shared key, which is used for identity authentication between the VPN gateway and the on-premises data center.</p>
         * <ul>
         * <li>The key must be 1 to 100 characters in length and can contain digits, uppercase letters, lowercase letters, and the following characters. It cannot contain spaces. <code>~!`@#$%^&amp;*()_-+={}[]|;:\\&quot;,.&lt;&gt;/?</code></li>
         * <li>If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/2526951.html">DescribeVpnConnection</a> operation to query the pre-shared key that is automatically generated by the system.<blockquote>
         * <p>The pre-shared key on the IPsec-VPN connection side must be the same as the authentication key on the on-premises data center side. Otherwise, the connection between the on-premises data center and the VPN gateway cannot be established.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>IkeConfig.IkeVersion</strong>: The version of the Internet Key Exchange protocol. Valid values: <strong>ikev1</strong> and <strong>ikev2</strong>.</p>
         * <p>  Compared with IKEv1, IKEv2 simplifies the SA negotiation process and provides better support for multi-CIDR-block scenarios.</p>
         * <p>  &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Chinese SM-based, only <strong>ikev1</strong> is supported for the IKE version.</ph></p>
         * </li>
         * <li><p><strong>IkeConfig.IkeMode</strong>: The negotiation mode of the IKE version. Valid values: <strong>main</strong> and <strong>aggressive</strong>.</p>
         * <ul>
         * <li><strong>main</strong>: Main mode. This mode offers high negotiation security.</li>
         * <li><strong>aggressive</strong>: Aggressive mode. This mode offers fast negotiation and a high success rate.</li>
         * </ul>
         * <p>  &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Chinese SM-based, only <strong>main</strong> is supported for the negotiation mode.</ph></p>
         * </li>
         * <li><p><strong>IkeConfig.IkeEncAlg</strong>: The encryption algorithm used in Phase 1 negotiation.</p>
         * <p>  &lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>.</ph></p>
         * <p>  &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is normal, valid values are <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>.</ph></p>
         * <p>  &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Chinese SM-based, the only valid value is <strong>sm4</strong>.</ph></p>
         * </li>
         * <li><p><strong>IkeConfig.IkeAuthAlg</strong>: The authentication algorithm used in Phase 1 negotiation.</p>
         * <p>  &lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, or <strong>sha512</strong>.</ph></p>
         * <p>  &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is normal, valid values are <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, or <strong>sha512</strong>.</ph></p>
         * <p>  &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Chinese SM-based, the only valid value is <strong>sm3</strong>.</ph></p>
         * </li>
         * <li><p><strong>IkeConfig.IkePfs</strong>: The Diffie-Hellman key exchange algorithm used in Phase 1 negotiation. Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, or <strong>group14</strong>.</p>
         * </li>
         * <li><p><strong>IkeConfig.IkeLifetime</strong>: The lifetime of the SA negotiated in Phase 1. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>.</p>
         * </li>
         * <li><p><strong>IkeConfig.LocalId</strong>: The identifier of the VPN gateway. The identifier can be up to 100 characters in length and cannot contain spaces. The default value is the IP address of the VPN gateway.</p>
         * </li>
         * <li><p><strong>IkeConfig.RemoteId</strong>: The identifier of the customer gateway. The identifier can be up to 100 characters in length and cannot contain spaces. The default value is the IP address of the customer gateway.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Psk&quot;:&quot;pgw6dy7d1i8i****&quot;,&quot;IkeVersion&quot;:&quot;ikev1&quot;,&quot;IkeMode&quot;:&quot;main&quot;,&quot;IkeEncAlg&quot;:&quot;aes&quot;,&quot;IkeAuthAlg&quot;:&quot;sha1&quot;,&quot;IkePfs&quot;:&quot;group2&quot;,&quot;IkeLifetime&quot;:86400,&quot;LocalId&quot;:&quot;116.64.XX.XX&quot;,&quot;RemoteId&quot;:&quot;139.18.XX.XX&quot;}</p>
         */
        public Builder ikeConfig(String ikeConfig) {
            this.putQueryParameter("IkeConfig", ikeConfig);
            this.ikeConfig = ikeConfig;
            return this;
        }

        /**
         * <p>This parameter is supported when you modify a single-tunnel IPsec-VPN connection.</p>
         * <p>The configuration of Phase 2 negotiation:</p>
         * <ul>
         * <li><p><strong>IpsecConfig.IpsecEncAlg</strong>: The encryption algorithm used in Phase 2 negotiation.</p>
         * <p>  &lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>.</ph></p>
         * <p>  &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Normal, valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>.</ph></p>
         * <p>  &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is ShangMi, the only valid value is <strong>sm4</strong>.</ph></p>
         * </li>
         * <li><p><strong>IpsecConfig.IpsecAuthAlg</strong>: The authentication algorithm used in Phase 2 negotiation.</p>
         * <p>  &lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, <strong>sha512</strong>.</ph></p>
         * <p>  &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Normal, valid values: <strong>md5</strong>, <strong>sha1</strong>, <strong>sha256</strong>, <strong>sha384</strong>, <strong>sha512</strong>.</ph></p>
         * <p>  &lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is ShangMi, the only valid value is <strong>sm3</strong>.</ph></p>
         * </li>
         * <li><p><strong>IpsecConfig.IpsecPfs</strong>: The Diffie-Hellman key exchange algorithm used in Phase 1 negotiation for forwarding packets of all protocols. Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, <strong>group14</strong>.</p>
         * </li>
         * <li><p><strong>IpsecConfig.IpsecLifetime</strong>: The lifetime of the security association (SA) established in Phase 2 negotiation. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>.</p>
         * </li>
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
         * <p>The CIDR block on the VPC side that needs to communicate with the on-premises data center. This parameter is used for Phase 2 negotiation.</p>
         * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.</p>
         * <p>Description of the IPsec-VPN connection routing mode:</p>
         * <ul>
         * <li>If both <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> are set to 0.0.0.0/0, the destination routing mode is used.</li>
         * <li>If both <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> are set to specific CIDR blocks, the protected data flow mode is used.</li>
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
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID of the IPsec-VPN connection.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is supported when you modify a single-tunnel mode IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
         */
        public Builder remoteCaCertificate(String remoteCaCertificate) {
            this.putQueryParameter("RemoteCaCertificate", remoteCaCertificate);
            this.remoteCaCertificate = remoteCaCertificate;
            return this;
        }

        /**
         * <p>The CIDR block on the on-premises data center side, used for Phase 2 negotiation.</p>
         * <p>Separate multiple CIDR blocks with commas (,). Example: 192.168.3.0/24,192.168.4.0/24.</p>
         * <p>Description of the routing mode for the IPsec-VPN connection:</p>
         * <ul>
         * <li>If both <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> are set to 0.0.0.0/0, the destination routing mode is used.</li>
         * <li>If both <strong>LocalSubnet</strong> and <strong>RemoteSubnet</strong> are set to specific CIDR blocks, the protected data flow mode is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10.2.1.0/24,10.2.2.0/24</p>
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
         * <p>The tunnel configurations to modify.</p>
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
         * <p>vco-bp1bbi27hojx80nck****</p>
         */
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.putQueryParameter("VpnConnectionId", vpnConnectionId);
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }

        @Override
        public ModifyVpnConnectionAttributeRequest build() {
            return new ModifyVpnConnectionAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyVpnConnectionAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyVpnConnectionAttributeRequest</p>
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
             * <p>The autonomous system number (ASN) on the Alibaba Cloud side. Valid values: <strong>1</strong> to <strong>4294967295</strong>. Default value: <strong>45104</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>65530</p>
             */
            public Builder localAsn(Long localAsn) {
                this.localAsn = localAsn;
                return this;
            }

            /**
             * <p>The BGP IP address on the Alibaba Cloud side. This address is an IP address within the BGP CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.10.1</p>
             */
            public Builder localBgpIp(String localBgpIp) {
                this.localBgpIp = localBgpIp;
                return this;
            }

            /**
             * <p>The BGP CIDR block of the tunnel.</p>
             * <p>The CIDR block must be a /30 CIDR block within 169.254.0.0/16, and cannot be 169.254.0.0/30, 169.254.1.0/30, 169.254.2.0/30, 169.254.3.0/30, 169.254.4.0/30, 169.254.5.0/30, 169.254.6.0/30, or 169.254.169.252/30.</p>
             * <blockquote>
             * <p>Within a VPN gateway instance, the BGP CIDR block of each tunnel must be unique.</p>
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
     * {@link ModifyVpnConnectionAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyVpnConnectionAttributeRequest</p>
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
             * <p>The authentication algorithm for Phase 1 negotiation.</p>
             * 
             * <strong>example:</strong>
             * <p>md5</p>
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm used in Phase 1 negotiations.</p>
             * <p>&lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>.</ph></p>
             * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Normal, valid values are <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>.</ph></p>
             * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Chinese SM, the only valid value is <strong>sm4</strong>.</ph></p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * <p>The lifetime of the security association (SA) generated by Phase 1 negotiation. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ikeLifetime(Long ikeLifetime) {
                this.ikeLifetime = ikeLifetime;
                return this;
            }

            /**
             * <p>The negotiation mode of the IKE version. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder ikeMode(String ikeMode) {
                this.ikeMode = ikeMode;
                return this;
            }

            /**
             * <p>The Diffie-Hellman key exchange algorithm used in Phase 1 negotiation. Valid values: <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, and <strong>group14</strong>.</p>
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
             * 
             * <strong>example:</strong>
             * <p>ikev1</p>
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * <p>The identifier on the Alibaba Cloud side, which is used for Phase 1 negotiation. The value can be up to 100 characters in length and cannot contain spaces. The default value is the IP address of the tunnel.</p>
             * 
             * <strong>example:</strong>
             * <p>47.21.XX.XX</p>
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * <p>The pre-shared key, which is used for identity authentication between the tunnel and the tunnel peer.</p>
             * <ul>
             * <li><p>The key must be 1 to 100 characters in length and can contain digits, uppercase letters, lowercase letters, and the following characters. It cannot contain spaces. <code>~!\\`@#$%^&amp;*()_-+={}[]|;:\\&quot;,.&lt;&gt;/?</code></p>
             * </li>
             * <li><p>If you do not specify a pre-shared key, the system randomly generates a 16-character string as the pre-shared key. You can call the <a href="https://help.aliyun.com/document_detail/2526951.html">DescribeVpnConnection</a> operation to query the pre-shared key automatically generated by the system.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>The pre-shared keys of the tunnel and the tunnel peer must be the same. Otherwise, the tunnel cannot be established.</p>
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
             * <p>The identifier of the tunnel peer, used for Phase 1 negotiation. The value can be up to 100 characters in length and cannot contain spaces. Default value: the IP address of the customer gateway associated with the tunnel.</p>
             * <p>RemoteId supports the FQDN format. If you use the FQDN format, set the negotiation mode to <strong>aggressive</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>47.42.XX.XX</p>
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
     * {@link ModifyVpnConnectionAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyVpnConnectionAttributeRequest</p>
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
             * <p>The authentication algorithm for Phase 2 negotiation.</p>
             * 
             * <strong>example:</strong>
             * <p>md5</p>
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm used in Phase 2 negotiations.</p>
             * <p>&lt;props=&quot;intl&quot;&gt;<ph>Valid values: <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>.</ph></p>
             * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Normal, valid values are <strong>aes</strong>, <strong>aes192</strong>, <strong>aes256</strong>, <strong>des</strong>, or <strong>3des</strong>.</ph></p>
             * <p>&lt;props=&quot;china&quot;&gt;<ph>If the VPN gateway instance type is Chinese SM, the only valid value is <strong>sm4</strong>.</ph></p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * <p>The lifetime of the SA generated by Phase 2 negotiation. Unit: seconds. Valid values: <strong>0</strong> to <strong>86400</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ipsecLifetime(Integer ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * <p>The Diffie-Hellman key exchange algorithm used in phase 2 negotiation.</p>
             * <p>Valid values: <strong>disabled</strong>, <strong>group1</strong>, <strong>group2</strong>, <strong>group5</strong>, <strong>group14</strong>.</p>
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
     * {@link ModifyVpnConnectionAttributeRequest} extends {@link TeaModel}
     *
     * <p>ModifyVpnConnectionAttributeRequest</p>
     */
    public static class TunnelOptionsSpecification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerGatewayId")
        private String customerGatewayId;

        @com.aliyun.core.annotation.NameInMap("EnableDpd")
        private Boolean enableDpd;

        @com.aliyun.core.annotation.NameInMap("EnableNatTraversal")
        private Boolean enableNatTraversal;

        @com.aliyun.core.annotation.NameInMap("RemoteCaCertificate")
        private String remoteCaCertificate;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("TunnelBgpConfig")
        private TunnelBgpConfig tunnelBgpConfig;

        @com.aliyun.core.annotation.NameInMap("TunnelId")
        private String tunnelId;

        @com.aliyun.core.annotation.NameInMap("TunnelIkeConfig")
        private TunnelIkeConfig tunnelIkeConfig;

        @com.aliyun.core.annotation.NameInMap("TunnelIpsecConfig")
        private TunnelIpsecConfig tunnelIpsecConfig;

        private TunnelOptionsSpecification(Builder builder) {
            this.customerGatewayId = builder.customerGatewayId;
            this.enableDpd = builder.enableDpd;
            this.enableNatTraversal = builder.enableNatTraversal;
            this.remoteCaCertificate = builder.remoteCaCertificate;
            this.role = builder.role;
            this.tunnelBgpConfig = builder.tunnelBgpConfig;
            this.tunnelId = builder.tunnelId;
            this.tunnelIkeConfig = builder.tunnelIkeConfig;
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
         * @return remoteCaCertificate
         */
        public String getRemoteCaCertificate() {
            return this.remoteCaCertificate;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
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
         * @return tunnelIpsecConfig
         */
        public TunnelIpsecConfig getTunnelIpsecConfig() {
            return this.tunnelIpsecConfig;
        }

        public static final class Builder {
            private String customerGatewayId; 
            private Boolean enableDpd; 
            private Boolean enableNatTraversal; 
            private String remoteCaCertificate; 
            private String role; 
            private TunnelBgpConfig tunnelBgpConfig; 
            private String tunnelId; 
            private TunnelIkeConfig tunnelIkeConfig; 
            private TunnelIpsecConfig tunnelIpsecConfig; 

            private Builder() {
            } 

            private Builder(TunnelOptionsSpecification model) {
                this.customerGatewayId = model.customerGatewayId;
                this.enableDpd = model.enableDpd;
                this.enableNatTraversal = model.enableNatTraversal;
                this.remoteCaCertificate = model.remoteCaCertificate;
                this.role = model.role;
                this.tunnelBgpConfig = model.tunnelBgpConfig;
                this.tunnelId = model.tunnelId;
                this.tunnelIkeConfig = model.tunnelIkeConfig;
                this.tunnelIpsecConfig = model.tunnelIpsecConfig;
            } 

            /**
             * <p>The instance ID of the customer gateway associated with the tunnel.</p>
             * 
             * <strong>example:</strong>
             * <p>cgw-1nmwbpgrp7ssqm1yn****</p>
             */
            public Builder customerGatewayId(String customerGatewayId) {
                this.customerGatewayId = customerGatewayId;
                return this;
            }

            /**
             * <p>Specifies whether to enable the Dead Peer Detection (DPD) feature for the tunnel. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Enables the DPD feature. The IPsec initiator sends DPD packets to check whether the peer device is alive. If no correct response is received within the specified period of time, the peer is considered disconnected. The ISAKMP SA and the corresponding IPsec SA are deleted, and the security tunnel is also deleted.</p>
             * </li>
             * <li><p><strong>false</strong>: Disables the DPD feature. The IPsec initiator does not send DPD packets.</p>
             * </li>
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
             * <li><p><strong>true</strong>: Enables NAT traversal. After NAT traversal is enabled, the IKE negotiation process skips UDP port number verification and can discover NAT gateway devices in the VPN tunnel.</p>
             * </li>
             * <li><p><strong>false</strong>: Disables NAT traversal.</p>
             * </li>
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
             * <p>If the current VPN gateway instance is a Chinese SM-based VPN gateway, you can modify the peer CA certificate for the tunnel.</p>
             * 
             * <strong>example:</strong>
             * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
             */
            public Builder remoteCaCertificate(String remoteCaCertificate) {
                this.remoteCaCertificate = remoteCaCertificate;
                return this;
            }

            /**
             * <p>The role of the tunnel.</p>
             * <ul>
             * <li><strong>master</strong>: The current tunnel is the primary tunnel.</li>
             * <li><strong>slave</strong>: The current tunnel is the secondary tunnel.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The BGP configuration of the tunnel to modify.</p>
             */
            public Builder tunnelBgpConfig(TunnelBgpConfig tunnelBgpConfig) {
                this.tunnelBgpConfig = tunnelBgpConfig;
                return this;
            }

            /**
             * <p>The tunnel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tun-opsqc4d97wni27****</p>
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * <p>The Phase 1 negotiation configuration.</p>
             */
            public Builder tunnelIkeConfig(TunnelIkeConfig tunnelIkeConfig) {
                this.tunnelIkeConfig = tunnelIkeConfig;
                return this;
            }

            /**
             * <p>The Phase 2 negotiation configuration.</p>
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
