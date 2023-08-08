// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpnConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateVpnConnectionRequest</p>
 */
public class CreateVpnConnectionRequest extends Request {
    @Query
    @NameInMap("AutoConfigRoute")
    private Boolean autoConfigRoute;

    @Query
    @NameInMap("BgpConfig")
    private String bgpConfig;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CustomerGatewayId")
    private String customerGatewayId;

    @Query
    @NameInMap("EffectImmediately")
    private Boolean effectImmediately;

    @Query
    @NameInMap("EnableDpd")
    private Boolean enableDpd;

    @Query
    @NameInMap("EnableNatTraversal")
    private Boolean enableNatTraversal;

    @Query
    @NameInMap("EnableTunnelsBgp")
    private Boolean enableTunnelsBgp;

    @Query
    @NameInMap("HealthCheckConfig")
    private String healthCheckConfig;

    @Query
    @NameInMap("IkeConfig")
    private String ikeConfig;

    @Query
    @NameInMap("IpsecConfig")
    private String ipsecConfig;

    @Query
    @NameInMap("LocalSubnet")
    @Validation(required = true)
    private String localSubnet;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RemoteCaCertificate")
    private String remoteCaCertificate;

    @Query
    @NameInMap("RemoteSubnet")
    @Validation(required = true)
    private String remoteSubnet;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Body
    @NameInMap("TunnelOptionsSpecification")
    private java.util.List < TunnelOptionsSpecification> tunnelOptionsSpecification;

    @Query
    @NameInMap("VpnGatewayId")
    @Validation(required = true)
    private String vpnGatewayId;

    private CreateVpnConnectionRequest(Builder builder) {
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
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.remoteCaCertificate = builder.remoteCaCertificate;
        this.remoteSubnet = builder.remoteSubnet;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tags = builder.tags;
        this.tunnelOptionsSpecification = builder.tunnelOptionsSpecification;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpnConnectionRequest create() {
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
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return tunnelOptionsSpecification
     */
    public java.util.List < TunnelOptionsSpecification> getTunnelOptionsSpecification() {
        return this.tunnelOptionsSpecification;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder extends Request.Builder<CreateVpnConnectionRequest, Builder> {
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
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String remoteCaCertificate; 
        private String remoteSubnet; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private java.util.List < Tags> tags; 
        private java.util.List < TunnelOptionsSpecification> tunnelOptionsSpecification; 
        private String vpnGatewayId; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpnConnectionRequest request) {
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
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.remoteCaCertificate = request.remoteCaCertificate;
            this.remoteSubnet = request.remoteSubnet;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tags = request.tags;
            this.tunnelOptionsSpecification = request.tunnelOptionsSpecification;
            this.vpnGatewayId = request.vpnGatewayId;
        } 

        /**
         * Specifies whether to automatically configure routes. Valid values:
         * <p>
         * 
         * *   **true** (default)
         * *   **false**
         */
        public Builder autoConfigRoute(Boolean autoConfigRoute) {
            this.putQueryParameter("AutoConfigRoute", autoConfigRoute);
            this.autoConfigRoute = autoConfigRoute;
            return this;
        }

        /**
         * The Border Gateway Protocol (BGP) configuration:
         * <p>
         * 
         * *   **BgpConfig.EnableBgp**: specifies whether to enable BGP. Valid values: **true** and **false**. Default value: false.
         * *   **BgpConfig.LocalAsn**: the ASN on the Alibaba Cloud side. Valid values: **1** to **4294967295**. Default value: **45104**.
         * *   **BgpConfig.TunnelCidr**: the CIDR block of the IPsec tunnel. The CIDR block must fall within 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.
         * *   **LocalBgpIp**: the BGP IP address on the Alibaba Cloud side. This IP address must fall within the CIDR block of the IPsec tunnel.
         * 
         * > 
         * 
         * *   This parameter is required when the VPN gateway has dynamic BGP enabled.
         * 
         * *   Before you configure BGP, we recommend that you learn about how BGP works and its limits. For more information, see [VPN Gateway supports BGP dynamic routing](~~170235~~).
         * *   We recommend that you use a private ASN to establish a connection with Alibaba Cloud over BGP. Refer to the relevant documentation for the private ASN range.
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
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the customer gateway.
         */
        public Builder customerGatewayId(String customerGatewayId) {
            this.putQueryParameter("CustomerGatewayId", customerGatewayId);
            this.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * Specify whether to immediately start IPsec negotiations after the configuration takes effect. Valid values:
         * <p>
         * 
         * *   **true**: immediately starts IPsec negotiations after the configuration is complete.
         * *   **false** (default): starts IPsec negotiations when inbound traffic is received.
         */
        public Builder effectImmediately(Boolean effectImmediately) {
            this.putQueryParameter("EffectImmediately", effectImmediately);
            this.effectImmediately = effectImmediately;
            return this;
        }

        /**
         * Specifies whether to enable the dead peer detection (DPD) feature. Valid values:
         * <p>
         * 
         * *   **true** (default) The initiator of the IPsec-VPN connection sends DPD packets to verify the existence and availability of the peer. If no response is received from the peer within a specified period of time, the connection fails. ISAKMP SAs and IPsec SAs are deleted. The IPsec tunnel is also deleted.
         * *   **false**: disables DPD. The IPsec initiator does not send DPD packets.
         */
        public Builder enableDpd(Boolean enableDpd) {
            this.putQueryParameter("EnableDpd", enableDpd);
            this.enableDpd = enableDpd;
            return this;
        }

        /**
         * Specifies whether to enable NAT traversal. Valid values:
         * <p>
         * 
         * *   **true** (default) After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the VPN tunnel.
         * *   **false**
         */
        public Builder enableNatTraversal(Boolean enableNatTraversal) {
            this.putQueryParameter("EnableNatTraversal", enableNatTraversal);
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }

        /**
         * 是否为隧道开启BGP功能。取值：**true**或**false**（默认值）。
         */
        public Builder enableTunnelsBgp(Boolean enableTunnelsBgp) {
            this.putQueryParameter("EnableTunnelsBgp", enableTunnelsBgp);
            this.enableTunnelsBgp = enableTunnelsBgp;
            return this;
        }

        /**
         * The health check configuration:
         * <p>
         * 
         * *   **HealthCheckConfig.enable**: specifies whether to enable health checks. Valid values: **true** and **false**. Default value: false.
         * *   **HealthCheckConfig.dip**: the destination IP address configured for health checks.
         * *   **HealthCheckConfig.sip:** the source IP address that is used for health checks.
         * *   **HealthCheckConfig.interval**: the time interval of health check retries. Unit: seconds. Default value: **3**.
         * *   **HealthCheckConfig.retry**: the maximum number of health check retries. Default value: **3**.
         */
        public Builder healthCheckConfig(String healthCheckConfig) {
            this.putQueryParameter("HealthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * The configuration of Phase 1 negotiations:
         * <p>
         * 
         * *   **IkeConfig.Psk**: The pre-shared key that is used for authentication between the VPN gateway and the data center. The key must be 1 to 100 characters in length.
         * 
         *         If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the DescribeVpnConnection operation to query the pre-shared key generated by the system. 
         * 
         *           The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the data center. Otherwise, the connection between the data center and the VPN gateway cannot be established. 
         * 
         * *   **IkeConfig.IkeVersion**: the IKE version. Valid values: **ikev1** and **ikev2**. Default value: **ikev1**.
         * 
         * *   **IkeConfig.IkeMode**: the negotiation mode of IKEv1. Valid values: **main** and **aggressive**. Default value: **main**.
         * 
         * *   **IkeConfig.IkeEncAlg**: the encryption algorithm that is used in Phase 1 negotiations. Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**. Default value: **aes**.
         * 
         * *   **IkeConfig.IkeAuthAlg**: the authentication algorithm that is used in Phase 1 negotiations. Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**. Default value: **md5**.
         * 
         * *   **IkeConfig.IkePfs**: The Diffie-Hellman (DH) key exchange algorithm that is used in Phase 1 negotiations. Valid values: **group1**, **group2**, **group5**, and **group14**. Default value: **group2**.
         * 
         * *   **IkeConfig.IkeLifetime**: the SA lifetime determined by Phase 1 negotiations. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.
         * 
         * *   **IkeConfig.LocalId**: the identifier of the VPN gateway. The identifier of the VPN gateway cannot exceed 100 characters in length. The default value is the IP address of the VPN gateway.
         * 
         * *   **IkeConfig.RemoteId**: the identifier of the customer gateway. The identifier of the customer gateway cannot exceed 100 characters in length. The default value is the IP address of the customer gateway.
         */
        public Builder ikeConfig(String ikeConfig) {
            this.putQueryParameter("IkeConfig", ikeConfig);
            this.ikeConfig = ikeConfig;
            return this;
        }

        /**
         * The configurations of Phase 2 negotiations:
         * <p>
         * 
         * *   **IpsecConfig.IpsecEncAlg**: the encryption algorithm that is used in Phase 2 negotiations. Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**. Default value: **aes**.
         * *   **IpsecConfig. IpsecAuthAlg**: the authentication algorithm that is used in Phase 2 negotiations. Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**. Default value: **md5**.
         * *   **IpsecConfig. IpsecPfs**: the Diffie-Hellman key exchange algorithm that is used in Phase 2 negotiations. Valid values: **disabled**, **group1**, **group2**, **group5**, and **group14**. Default value: **group2**.
         * *   **IpsecConfig. IpsecLifetime**: the SA lifetime that is determined by Phase 2 negotiations. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.
         */
        public Builder ipsecConfig(String ipsecConfig) {
            this.putQueryParameter("IpsecConfig", ipsecConfig);
            this.ipsecConfig = ipsecConfig;
            return this;
        }

        /**
         * The CIDR block on the virtual private cloud (VPC) side. The CIDR block is used in Phase 2 negotiations.
         * <p>
         * 
         * Separate CIDR blocks with commas (,). Example: 192.168.1.0/24,192.168.2.0/24.
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
         * The ID of the region where the IPsec-VPN connection is created. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The peer CA certificate when a ShangMi (SM) VPN gateway is used to establish the IPsec-VPN connection.
         * <p>
         * 
         * *   This parameter is required when an SM VPN gateway is used to establish the IPsec-VPN connection.
         * *   You can ignore this parameter when a standard VPN gateway is used to create the IPsec-VPN connection.
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
         * Separate CIDR blocks with commas (,). Example: 192.168.3.0/24,192.168.4.0/24.
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
         * The tag value.
         * <p>
         * 
         * The tag value can be an empty string and cannot exceed 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.
         * 
         * Each tag key corresponds to one tag value. You can specify up to 20 tag values in each call.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * 配置隧道。
         * <p>
         * 
         * 如果当前VPN网关实例支持创建双隧道模式的IPsec-VPN连接，您必须同时为IPsec-VPN连接添加主隧道和备隧道的配置（即配置**TunnelOptionsSpecification**数组下的参数）。一个IPsec-VPN连接下仅支持添加主备两条隧道。
         */
        public Builder tunnelOptionsSpecification(java.util.List < TunnelOptionsSpecification> tunnelOptionsSpecification) {
            this.putBodyParameter("TunnelOptionsSpecification", tunnelOptionsSpecification);
            this.tunnelOptionsSpecification = tunnelOptionsSpecification;
            return this;
        }

        /**
         * The ID of the VPN gateway.
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.putQueryParameter("VpnGatewayId", vpnGatewayId);
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        @Override
        public CreateVpnConnectionRequest build() {
            return new CreateVpnConnectionRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The tag key. The tag key cannot be an empty string.
             * <p>
             * 
             * It can be at most 64 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.
             * 
             * You can specify at most 20 tag keys in each call.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             * <p>
             * 
             * The tag value can be an empty string and cannot exceed 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.
             * 
             * Each tag key corresponds to one tag value. You can specify at most 20 tag values in each call.
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
    public static class TunnelBgpConfig extends TeaModel {
        @NameInMap("LocalAsn")
        private Long localAsn;

        @NameInMap("LocalBgpIp")
        private String localBgpIp;

        @NameInMap("TunnelCidr")
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
             * 隧道本端（阿里云侧）的自治系统号。自治系统号取值范围：**1**~**4294967295**。默认值：**45104**。
             * <p>
             * 
             * > - 当您为IPsec连接开启BGP功能后（即指定**EnableTunnelsBgp**参数的值为**true**）需要配置该参数。
             * - 在添加BGP配置前，建议您先了解BGP动态路由功能的工作机制和使用限制。更多信息，请参见[VPN网关支持BGP动态路由公告](~~170235~~)。
             * - 建议您使用自治系统号的私有号码与阿里云建立BGP连接。自治系统号的私有号码范围请自行查阅文档。
             */
            public Builder localAsn(Long localAsn) {
                this.localAsn = localAsn;
                return this;
            }

            /**
             * 隧道本端（阿里云侧）的BGP地址。该地址为BGP网段内的一个IP地址。
             */
            public Builder localBgpIp(String localBgpIp) {
                this.localBgpIp = localBgpIp;
                return this;
            }

            /**
             * 隧道的BGP网段。该网段需是一个在169.254.0.0/16内的掩码长度为30的网段。
             * <p>
             * 
             * >在一个VPN网关实例下，每个隧道的BGP网段需保持唯一。
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
        @NameInMap("IkeAuthAlg")
        private String ikeAuthAlg;

        @NameInMap("IkeEncAlg")
        private String ikeEncAlg;

        @NameInMap("IkeLifetime")
        private Long ikeLifetime;

        @NameInMap("IkeMode")
        private String ikeMode;

        @NameInMap("IkePfs")
        private String ikePfs;

        @NameInMap("IkeVersion")
        private String ikeVersion;

        @NameInMap("LocalId")
        private String localId;

        @NameInMap("Psk")
        private String psk;

        @NameInMap("RemoteId")
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
             * 第一阶段协商的认证算法。
             * <p>
             * 
             * <props="intl"><ph>取值：**md5**、**sha1**、**sha256**、**sha384**、**sha512**。默认值：**md5**。</ph></props>
             * 
             * <props="china"><ph>如果VPN网关实例类型为普通型，则取值：**md5**、**sha1**、**sha256**、**sha384**、**sha512**。默认值：**md5**。</ph></props>
             * 
             * <props="china"><ph>如果VPN网关实例类型为国密型，则取值为**sm3**（默认值）。</ph></props>
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * 第一阶段协商的加密算法。
             * <p>
             * 
             * <props="intl"><ph>取值：**aes**、**aes192**、**aes256**、**des**或**3des**。默认值：**aes**。 </ph></props>
             * 
             * <props="china"><ph>如果VPN网关实例类型为普通型，则取值为**aes**、**aes192**、**aes256**、**des**或**3des**。默认值：**aes**。</ph></props>
             * 
             * <props="china"><ph>如果VPN网关实例类型为国密型，则取值为**sm4**（默认值）。</ph></props>
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * 第一阶段协商出的SA的生存周期。单位：秒。
             * <p>
             * 
             * 取值范围：**0**~**86400**。默认值：**86400**。
             */
            public Builder ikeLifetime(Long ikeLifetime) {
                this.ikeLifetime = ikeLifetime;
                return this;
            }

            /**
             * IKE版本的协商模式。取值：**main**或**aggressive**。默认值：**main**。   
             * <p>
             * 
             * - **main**：主模式，协商过程安全性高。
             * - **aggressive**：野蛮模式，协商快速且协商成功率高。
             * 
             * <props="china"><ph>如果VPN网关实例类型为国密型，则协商模式仅支持**main**。</ph></props>
             */
            public Builder ikeMode(String ikeMode) {
                this.ikeMode = ikeMode;
                return this;
            }

            /**
             * 第一阶段协商使用的Diffie-Hellman密钥交换算法。默认值：**group2**。   
             * <p>
             * 取值：**group1**、**group2**、**group5**、**group14**。
             */
            public Builder ikePfs(String ikePfs) {
                this.ikePfs = ikePfs;
                return this;
            }

            /**
             * IKE协议的版本。取值：**ikev1**或**ikev2**。默认值：**ikev1**。
             * <p>
             * 
             * 相对于IKEv1版本，IKEv2版本简化了SA的协商过程并且对于多网段的场景提供了更好的支持。
             *    
             * <props="china"><ph>如果VPN网关实例类型为国密型，则IKE版本仅支持**ikev1**。</ph></props>
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * 隧道本端（阿里云侧）的标识，用于第一阶段的协商。长度限制为100个字符。默认值为隧道的IP地址。
             * <p>
             * 
             * **LocalId**支持FQDN格式，如果您使用FQDN格式，协商模式建议选择为**aggressive**（野蛮模式）。
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * 预共享密钥，用于隧道与隧道对端之间的身份认证。
             * <p>
             * 
             *     - 密钥长度为1~100个字符，支持数字、大小写英文字母以及以下字符。```~!\`@#$%^&*()_-+={}[]|;:\",.<>/?```
             *     - 若您未指定预共享密钥，系统会随机生成一个16位的字符串作为预共享密钥。您可以调用[DescribeVpnConnection](~~120374~~)接口查询系统自动生成的预共享密钥。     
             * 
             *         > 隧道及隧道对端的预共享密钥需一致，否则系统无法正常建立隧道。
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * 隧道对端的标识，用于第一阶段的协商。长度限制为100个字符。默认值为隧道关联的用户网关的IP地址。
             * <p>
             * 
             * **RemoteId**支持FQDN格式，如果您使用FQDN格式，协商模式建议选择为**aggressive**（野蛮模式）。
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
        @NameInMap("IpsecAuthAlg")
        private String ipsecAuthAlg;

        @NameInMap("IpsecEncAlg")
        private String ipsecEncAlg;

        @NameInMap("IpsecLifetime")
        private Long ipsecLifetime;

        @NameInMap("IpsecPfs")
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
        public Long getIpsecLifetime() {
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
            private Long ipsecLifetime; 
            private String ipsecPfs; 

            /**
             * 第二阶段协商的认证算法。
             * <p>
             * 
             * <props="intl"><ph>取值：**md5**、**sha1**、**sha256**、**sha384**、**sha512**。默认值：**md5**。</ph></props>
             * 
             * <props="china"><ph>如果VPN网关实例类型为普通型，则取值：**md5**、**sha1**、**sha256**、**sha384**、**sha512**。默认值：**md5**。</ph></props>
             * 
             * <props="china"><ph>如果VPN网关实例类型为国密型，则取值为**sm3**（默认值）。</ph></props>
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * 第二阶段协商的加密算法。
             * <p>
             * 
             * <props="intl"><ph>取值：**aes**、**aes192**、**aes256**、**des**或**3des**。默认值：**aes**。 </ph></props>
             * 
             * <props="china"><ph>如果VPN网关实例类型为普通型，则取值为**aes**、**aes192**、**aes256**、**des**或**3des**。默认值：**aes**。</ph></props>
             * 
             * <props="china"><ph>如果VPN网关实例类型为国密型，则取值为**sm4**（默认值）。</ph></props>
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * 第二阶段协商出的SA的生存周期。单位：秒。
             * <p>
             * 
             * 取值范围：**0**~**86400**。默认值：**86400**。
             */
            public Builder ipsecLifetime(Long ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * 第二阶段协商使用的Diffie-Hellman密钥交换算法。默认值：**group2**。   
             * <p>
             * 
             * 取值：**disabled**、**group1**、**group2**、**group5**、**group14**。
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
        @NameInMap("CustomerGatewayId")
        private String customerGatewayId;

        @NameInMap("EnableDpd")
        private Boolean enableDpd;

        @NameInMap("EnableNatTraversal")
        private Boolean enableNatTraversal;

        @NameInMap("RemoteCaCertificate")
        private String remoteCaCertificate;

        @NameInMap("Role")
        private String role;

        @NameInMap("TunnelBgpConfig")
        private TunnelBgpConfig tunnelBgpConfig;

        @NameInMap("TunnelIkeConfig")
        private TunnelIkeConfig tunnelIkeConfig;

        @NameInMap("TunnelIpsecConfig")
        private TunnelIpsecConfig tunnelIpsecConfig;

        private TunnelOptionsSpecification(Builder builder) {
            this.customerGatewayId = builder.customerGatewayId;
            this.enableDpd = builder.enableDpd;
            this.enableNatTraversal = builder.enableNatTraversal;
            this.remoteCaCertificate = builder.remoteCaCertificate;
            this.role = builder.role;
            this.tunnelBgpConfig = builder.tunnelBgpConfig;
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
            private TunnelIkeConfig tunnelIkeConfig; 
            private TunnelIpsecConfig tunnelIpsecConfig; 

            /**
             * 隧道关联的用户网关ID。
             * <p>
             * 
             * > - 在VPN网关实例支持创建双隧道模式的IPsec-VPN连接的场景下，本参数必填。
             * - 如果当前VPN网关实例支持创建双隧道模式的IPsec-VPN连接，您必须同时为IPsec-VPN连接添加主隧道和备隧道的配置（即配置**TunnelOptionsSpecification**数组下的参数）。一个IPsec-VPN连接仅支持添加主备两条隧道。
             */
            public Builder customerGatewayId(String customerGatewayId) {
                this.customerGatewayId = customerGatewayId;
                return this;
            }

            /**
             * 是否为隧道开启DPD（对等体存活检测）功能。取值：
             * <p>
             * 
             * - **true**（默认值）：开启DPD功能。IPsec发起端会发送DPD报文用来检测对端的设备是否存活，如果在设定时间内未收到正确回应则认为对端已经断线，IPsec将删除ISAKMP SA和相应的IPsec SA，安全隧道同样也会被删除。
             * 
             * - **false**：不开启DPD功能，IPsec发起端不会发送DPD探测报文。
             */
            public Builder enableDpd(Boolean enableDpd) {
                this.enableDpd = enableDpd;
                return this;
            }

            /**
             * 是否为隧道开启NAT穿越功能。取值：
             * <p>
             * 
             * - **true**（默认值）：开启NAT穿越功能。开启后，IKE协商过程会删除对UDP端口号的验证过程，同时实现对隧道中NAT网关设备的发现功能。
             * 
             * - **false**：不开启NAT穿越功能。
             */
            public Builder enableNatTraversal(Boolean enableNatTraversal) {
                this.enableNatTraversal = enableNatTraversal;
                return this;
            }

            /**
             * 如果当前VPN网关实例为国密型VPN网关，您需要为隧道配置对端的CA证书。
             * <p>
             * 
             * - 对于国密型VPN网关，此项必填。
             * 
             * - 对于普通型VPN网关，此项需要为空。
             */
            public Builder remoteCaCertificate(String remoteCaCertificate) {
                this.remoteCaCertificate = remoteCaCertificate;
                return this;
            }

            /**
             * 隧道的角色。取值：
             * <p>
             * 
             * - **master**：表示当前隧道为主隧道。
             * - **slave**：表示当前隧道为备隧道。
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * 为隧道添加BGP配置。
             */
            public Builder tunnelBgpConfig(TunnelBgpConfig tunnelBgpConfig) {
                this.tunnelBgpConfig = tunnelBgpConfig;
                return this;
            }

            /**
             * 第一阶段协商的配置信息。
             */
            public Builder tunnelIkeConfig(TunnelIkeConfig tunnelIkeConfig) {
                this.tunnelIkeConfig = tunnelIkeConfig;
                return this;
            }

            /**
             * 第二阶段协商的配置信息。
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
