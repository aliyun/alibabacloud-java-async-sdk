// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < TunnelOptionsSpecification> tunnelOptionsSpecification;

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
    public java.util.List < TunnelOptionsSpecification> getTunnelOptionsSpecification() {
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
        private java.util.List < TunnelOptionsSpecification> tunnelOptionsSpecification; 
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
         * Specifies whether to automatically advertise routes. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder autoConfigRoute(Boolean autoConfigRoute) {
            this.putQueryParameter("AutoConfigRoute", autoConfigRoute);
            this.autoConfigRoute = autoConfigRoute;
            return this;
        }

        /**
         * This parameter is supported by single-tunnel IPsec-VPN connections.
         * <p>
         * 
         * The Border Gateway Protocol (BGP) configurations:
         * 
         * *   **BgpConfig.EnableBgp:** specifies whether to enable BGP. Valid values: **true** and **false**.
         * 
         * *   **BgpConfig.LocalAsn:** the autonomous system number (ASN) on the Alibaba Cloud side. Valid values: **1** to **4294967295**.
         * 
         *     You can enter the ASN in two segments. Separate the first 16 bits of the ASN from the remaining 16 bits with a period (.). Enter the number in each segment in decimal format.
         * 
         *     For example, if you enter 123.456, the ASN is: 123 × 65536 + 456 = 8061384.
         * 
         * *   **BgpConfig.TunnelCidr**: the CIDR block of the IPsec tunnel. The CIDR block must belong to 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.
         * 
         *     > The CIDR block of the IPsec tunnel of each IPsec-VPN connection must be unique on a VPN gateway.
         * 
         * *   **LocalBgpIp**: the BGP IP address on the Alibaba Cloud side. This IP address must fall within the CIDR block range of the IPsec tunnel.
         * 
         * > - This parameter is required when the VPN gateway has dynamic BGP enabled.
         * > - Before you configure BGP, we recommend that you learn about how BGP works and its limits. For more information, see [BGP dynamic routing ](~~170235~~).
         * > - We recommend that you use a private ASN to establish a connection with Alibaba Cloud over BGP. For information about the range of private ASNs, see the relevant documentation.
         */
        public Builder bgpConfig(String bgpConfig) {
            this.putQueryParameter("BgpConfig", bgpConfig);
            this.bgpConfig = bgpConfig;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * >  If you do not specify this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to immediately start IPsec negotiations after the configuration takes effect. Valid values:
         * <p>
         * 
         * *   **true**: immediately starts IPsec negotiations after the configuration takes effect.
         * *   **false**: IPsec negotiations start when inbound traffic is detected.
         */
        public Builder effectImmediately(Boolean effectImmediately) {
            this.putQueryParameter("EffectImmediately", effectImmediately);
            this.effectImmediately = effectImmediately;
            return this;
        }

        /**
         * You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.
         * <p>
         * 
         * Specifies whether to enable the dead peer detection (DPD) feature. Valid values:
         * 
         * *   **true:**: enables the DPD feature. The initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no feedback is received from the peer within a specific period of time, the connection fails. Then, the ISAKMP SA, IPsec SA, and IPsec tunnel are deleted.
         * *   **false**: disables the DPD feature. The initiator of the IPsec-VPN connection does not send DPD packets.
         */
        public Builder enableDpd(Boolean enableDpd) {
            this.putQueryParameter("EnableDpd", enableDpd);
            this.enableDpd = enableDpd;
            return this;
        }

        /**
         * You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.
         * <p>
         * 
         * Specifies whether to enable NAT traversal. Valid values:
         * 
         * *   **true** After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the IPsec tunnel.
         * *   **false**
         */
        public Builder enableNatTraversal(Boolean enableNatTraversal) {
            this.putQueryParameter("EnableNatTraversal", enableNatTraversal);
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }

        /**
         * You can specify this parameter if you modify the configuration of a dual-tunnel IPsec-VPN connection.
         * <p>
         * 
         * Specifies whether to enable BGP for the tunnel. Valid values: **true** and **false**.
         */
        public Builder enableTunnelsBgp(Boolean enableTunnelsBgp) {
            this.putQueryParameter("EnableTunnelsBgp", enableTunnelsBgp);
            this.enableTunnelsBgp = enableTunnelsBgp;
            return this;
        }

        /**
         * You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.
         * <p>
         * 
         * The health check configuration:
         * 
         * *   **HealthCheckConfig.enable**: specifies whether to enable health checks. Valid values: **true** and **false**.
         * *   **HealthCheckConfig.dip**: the destination IP address that is used for health checks.
         * *   **HealthCheckConfig.sip**: the source IP address that is used for health checks.
         * *   **HealthCheckConfig.interval**: the interval between two consecutive health checks. Unit: seconds.
         * *   **HealthCheckConfig.retry**: the maximum number of health check retries.
         */
        public Builder healthCheckConfig(String healthCheckConfig) {
            this.putQueryParameter("HealthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * This parameter is supported by single-tunnel IPsec-VPN connections.
         * <p>
         * 
         * The configurations of Phase 1 negotiations:
         * 
         * *   **IkeConfig.Psk**: the pre-shared key that is used for authentication between the VPN gateway and the data center.
         * 
         *     *   It must be 1 to 100 characters in length, and can contain letters, digits, and the following characters: ``~!`@#$%^&*()_-+={}[]|;:\",.<>/?``
         *     *   If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the [DescribeVpnConnection](~~2526951~~) operation to query the pre-shared key that is generated by the system.
         * 
         *      > The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the on-premises database. Otherwise, the on-premises database and the VPN gateway cannot establish a connection.
         * 
         * *   **IkeConfig.IkeVersion**: the version of the Internet Key Exchange (IKE) protocol. Valid values: **ikev1** and **ikev2**.
         * 
         *     Compared with IKEv1, IKEv2 simplifies the security association (SA) negotiation process and is more suitable for scenarios in which multiple CIDR blocks are used.
         * 
         * *   **IkeConfig.IkeMode**: the negotiation mode of IKE. Valid values: **main** and **aggressive**.
         * 
         *     *   **main**: This mode offers higher security during negotiations.
         *     *   **aggressive**: This mode is faster and has a higher success rate.
         * 
         * *   **IkeConfig.IkeEncAlg**: the encryption algorithm that is used in Phase 1 negotiations.
         * 
         *     Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**.
         * 
         * *   **IkeConfig.IkeAuthAlg**: the authentication algorithm that is used in Phase 1 negotiations.
         * 
         *     Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**.
         * 
         * *   **IkeConfig.IkePfs**: the Diffie-Hellman (DH) key exchange algorithm that is used in Phase 1 negotiations. Valid values: **group1**, **group2**, **group5**, and **group14**.
         * 
         * *   **IkeConfig.IkeLifetime**: the security association (SA) lifetime that is determined by Phase 1 negotiations. Unit: seconds. Valid values: **0 to 86400**.
         * 
         * *   **IkeConfig.LocalId**: the identifier of the VPN gateway. The identifier cannot exceed 100 characters in length. The default value is the IP address of the VPN gateway.
         * 
         * *   **IkeConfig.RemoteId**: the identifier of the customer gateway. The identifier cannot exceed 100 characters in length. The default value is the IP address of the customer gateway.
         */
        public Builder ikeConfig(String ikeConfig) {
            this.putQueryParameter("IkeConfig", ikeConfig);
            this.ikeConfig = ikeConfig;
            return this;
        }

        /**
         * You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.
         * <p>
         * 
         * The configuration of Phase 2 negotiations:
         * 
         * *   **IpsecConfig.IpsecEncAlg**: the encryption algorithm that is used in Phase 2 negotiations.
         * 
         *     Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**.
         * 
         * *   **IpsecConfig. IpsecAuthAlg**: the authentication algorithm that is used in Phase 2 negotiations.
         * 
         *     Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**.
         * 
         * *   **IpsecConfig. IpsecPfs**: the DH key exchange algorithm that is used in Phase 1 negotiations. If you specify this parameter, packets of all protocols are forwarded. Valid values: **disabled**, **group1**, **group2**, **group5**, and **group14**.
         * 
         * *   **IpsecConfig. IpsecLifetime:** the SA lifetime that is determined by Phase 2 negotiations. Unit: seconds. Valid values: **0 to 86400**.
         */
        public Builder ipsecConfig(String ipsecConfig) {
            this.putQueryParameter("IpsecConfig", ipsecConfig);
            this.ipsecConfig = ipsecConfig;
            return this;
        }

        /**
         * The CIDR block used to connect the virtual private cloud (VPC) to the data center. The CIDR block is used in Phase 2 negotiations.
         * <p>
         * 
         * Separate multiple CIDR blocks with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.
         * 
         * The following routing modes are supported:
         * 
         * *   If you set **LocalSubnet** and **RemoteSubnet** to 0.0.0.0/0, the routing mode of the IPsec-VPN connection is set to Destination Routing Mode.
         * *   If you set **LocalSubnet** and **RemoteSubnet** to specific CIDR blocks, the routing mode of the IPsec-VPN connection is set to Protected Data Flows.
         */
        public Builder localSubnet(String localSubnet) {
            this.putQueryParameter("LocalSubnet", localSubnet);
            this.localSubnet = localSubnet;
            return this;
        }

        /**
         * The name of the IPsec-VPN connection.
         * <p>
         * 
         * The name must be 1 to 100 characters in length and cannot start with `http://` or `https://`.
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
         * The ID of the region in which the IPsec-VPN connection is created.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * You can specify this parameter if you modify the configuration of a single-tunnel IPsec-VPN connection.
         * <p>
         * 
         * If the VPN gateway uses a ShangMi (SM) certificate, you can modify the CA certificate used by the IPsec peer.
         * 
         * If the VPN gateway does not use an SM certificate, you cannot specify this parameter.
         */
        public Builder remoteCaCertificate(String remoteCaCertificate) {
            this.putQueryParameter("RemoteCaCertificate", remoteCaCertificate);
            this.remoteCaCertificate = remoteCaCertificate;
            return this;
        }

        /**
         * The CIDR block on the data center side. This CIDR block is used in Phase 2 negotiations.
         * <p>
         * 
         * Separate multiple CIDR blocks with commas (,). Example: 192.168.3.0/24,192.168.4.0/24.
         * 
         * The following routing modes are supported:
         * 
         * *   If you set **LocalSubnet** and **RemoteSubnet** to 0.0.0.0/0, the routing mode of the IPsec-VPN connection is set to Destination Routing Mode.
         * *   If you set **LocalSubnet** and **RemoteSubnet** to specific CIDR blocks, the routing mode of the IPsec-VPN connection is set to Protected Data Flows.
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
         * The tunnel configurations.
         * <p>
         * 
         * You can specify the parameters in **TunnelOptionsSpecification** if you modify the configuration of a dual-tunnel IPsec-VPN connection. You can modify both the active and standby tunnels of the IPsec-VPN connection.
         */
        public Builder tunnelOptionsSpecification(java.util.List < TunnelOptionsSpecification> tunnelOptionsSpecification) {
            this.putBodyParameter("TunnelOptionsSpecification", tunnelOptionsSpecification);
            this.tunnelOptionsSpecification = tunnelOptionsSpecification;
            return this;
        }

        /**
         * The ID of the IPsec-VPN connection.
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

            /**
             * The ASN of the tunnel on the Alibaba Cloud side. Valid values: **1** to **4294967295**. Default value: **45104**.
             * <p>
             * 
             * > - You can specify or modify this parameter if BGP is enabled for the IPsec-VPN connection (**EnableTunnelsBgp** is set to **true**).
             * > - Before you configure BGP, we recommend that you learn about how BGP works and its limits. For more information, see [VPN Gateway supports BGP dynamic routing](~~170235~~).
             * > - We recommend that you use a private ASN to establish a connection with Alibaba Cloud over BGP. For information about the range of private ASNs, see the relevant documentation.
             */
            public Builder localAsn(Long localAsn) {
                this.localAsn = localAsn;
                return this;
            }

            /**
             * The BGP IP address of the tunnel on the Alibaba Cloud side. The address is an IP address that falls within the BGP CIDR block range.
             */
            public Builder localBgpIp(String localBgpIp) {
                this.localBgpIp = localBgpIp;
                return this;
            }

            /**
             * The BGP CIDR block of the tunnel. The CIDR block must belong to 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.
             * <p>
             * 
             * >  The BGP CIDR block of a tunnel associated with a VPN gateway must be unique.
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

            /**
             * The authentication algorithm that is used in Phase 1 negotiations.
             * <p>
             * 
             * Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**.
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * The encryption algorithm that is used in Phase 1 negotiations.
             * <p>
             * 
             * Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**.
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * The SA lifetime that is determined by Phase 1 negotiations. Unit: seconds. Valid values: **0** to **86400**.
             */
            public Builder ikeLifetime(Long ikeLifetime) {
                this.ikeLifetime = ikeLifetime;
                return this;
            }

            /**
             * The IKE negotiation mode. Valid values:
             * <p>
             * 
             * *   **main**: This mode offers higher security during negotiations.
             * *   **aggressive**: This mode is faster and has a higher success rate.
             */
            public Builder ikeMode(String ikeMode) {
                this.ikeMode = ikeMode;
                return this;
            }

            /**
             * The DH key exchange algorithm that is used in Phase 1 negotiations. Valid values: **group1**, **group2**, **group5**, and **group14**.
             */
            public Builder ikePfs(String ikePfs) {
                this.ikePfs = ikePfs;
                return this;
            }

            /**
             * The version of the IKE protocol. Valid values: **ikev1** and **ikev2**.
             * <p>
             * 
             * Compared with IKEv1, IKEv2 simplifies the security association (SA) negotiation process and is more suitable for scenarios in which multiple CIDR blocks are used.
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * The identifier on the Alibaba Cloud side, which is used in Phase 1 negotiations. The identifier cannot exceed 100 characters in length. The default identifier is the IP address of the tunnel.
             * <p>
             * 
             * You can set **LocalId** to a fully qualified domain name (FQDN). In this case, we recommend that you set IkeMode to **aggressive**.
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * The pre-shared key, which is used for identity authentication between the tunnel and the tunnel peer.
             * <p>
             * 
             * *   The key must be 1 to 100 characters in length and can contain digits, letters, and the following characters: ``~!\`@#$%^&*()_-+={}[]|;:\",.<>/?``
             * *   If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the [DescribeVpnConnection](~~2526951~~) operation to query the pre-shared key that is generated by the system.
             * 
             * >  The tunnel and the tunnel peer must use the same pre-shared key. Otherwise, the tunnel cannot be established.
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * The identifier of the tunnel peer, which is used in Phase 1 negotiations. The identifier cannot exceed 100 characters in length. The default identifier is the IP address of the customer gateway associated with the tunnel.
             * <p>
             * 
             * You can set **RemoteId** to an FQDN. In this case, we recommend that you set IkeMode to **aggressive**.
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

            /**
             * The authentication algorithm that is used in Phase 2 negotiations.
             * <p>
             * 
             * Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**.
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * The encryption algorithm that is used in Phase 2 negotiations.
             * <p>
             * 
             * Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**.
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * The SA lifetime that is determined by Phase 2 negotiations. Unit: seconds. Valid values: **0** to **86400**.
             */
            public Builder ipsecLifetime(Integer ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * The DH key exchange algorithm that is used in Phase 2 negotiations.
             * <p>
             * 
             * Valid values: **disabled**, **group1**, **group2**, **group5**, and **group14**.
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
    public static class TunnelOptionsSpecification extends TeaModel {
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
            private Boolean enableDpd; 
            private Boolean enableNatTraversal; 
            private String remoteCaCertificate; 
            private String role; 
            private TunnelBgpConfig tunnelBgpConfig; 
            private String tunnelId; 
            private TunnelIkeConfig tunnelIkeConfig; 
            private TunnelIpsecConfig tunnelIpsecConfig; 

            /**
             * Specifies whether to enable the Dead Peer Detection (DPD) feature for the tunnel. Valid values:
             * <p>
             * 
             * *   **true** The initiator of the IPsec-VPN connection sends DPD packets to check the existence and availability of the peer. If no feedback is received from the peer within a specified period of time, the connection fails. ISAKMP SA and IPsec SA are deleted. The security tunnel is also deleted.
             * *   **false**
             */
            public Builder enableDpd(Boolean enableDpd) {
                this.enableDpd = enableDpd;
                return this;
            }

            /**
             * Specifies whether to enable NAT traversal for the tunnel. Valid values:
             * <p>
             * 
             * *   **true** After NAT traversal is enabled, the initiator does not check the UDP ports during Internet Key Exchange (IKE) negotiations and can automatically discover NAT gateway devices along the IPsec-VPN tunnel.
             * *   **false**
             */
            public Builder enableNatTraversal(Boolean enableNatTraversal) {
                this.enableNatTraversal = enableNatTraversal;
                return this;
            }

            /**
             * If the VPN gateway uses an SM certificate, you can modify the CA certificate used by the IPsec peer.
             * <p>
             * 
             * If the VPN gateway does not use an SM certificate, this parameter is not supported.
             */
            public Builder remoteCaCertificate(String remoteCaCertificate) {
                this.remoteCaCertificate = remoteCaCertificate;
                return this;
            }

            /**
             * The tunnel role. Valid values:
             * <p>
             * 
             * *   **master**: The tunnel is an active tunnel.
             * *   **slave**: The tunnel is a standby tunnel.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The Border Gateway Protocol (BGP) configurations of the tunnel.
             */
            public Builder tunnelBgpConfig(TunnelBgpConfig tunnelBgpConfig) {
                this.tunnelBgpConfig = tunnelBgpConfig;
                return this;
            }

            /**
             * **TunnelOptionsSpecification** parameters are supported by dual-tunnel IPsec-VPN gateways. You can modify both the active and standby tunnels of the IPsec-VPN connection.
             * <p>
             * 
             * The tunnel ID.
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * The configurations of Phase 1 negotiations.
             */
            public Builder tunnelIkeConfig(TunnelIkeConfig tunnelIkeConfig) {
                this.tunnelIkeConfig = tunnelIkeConfig;
                return this;
            }

            /**
             * The configurations of Phase 2 negotiations.
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
