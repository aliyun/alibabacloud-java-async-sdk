// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpnAttachmentRequest} extends {@link RequestModel}
 *
 * <p>CreateVpnAttachmentRequest</p>
 */
public class CreateVpnAttachmentRequest extends Request {
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
    @Validation(required = true)
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
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RemoteCaCert")
    private String remoteCaCert;

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

    private CreateVpnAttachmentRequest(Builder builder) {
        super(builder);
        this.autoConfigRoute = builder.autoConfigRoute;
        this.bgpConfig = builder.bgpConfig;
        this.clientToken = builder.clientToken;
        this.customerGatewayId = builder.customerGatewayId;
        this.effectImmediately = builder.effectImmediately;
        this.enableDpd = builder.enableDpd;
        this.enableNatTraversal = builder.enableNatTraversal;
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
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpnAttachmentRequest create() {
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
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateVpnAttachmentRequest, Builder> {
        private Boolean autoConfigRoute; 
        private String bgpConfig; 
        private String clientToken; 
        private String customerGatewayId; 
        private Boolean effectImmediately; 
        private Boolean enableDpd; 
        private Boolean enableNatTraversal; 
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
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateVpnAttachmentRequest request) {
            super(request);
            this.autoConfigRoute = request.autoConfigRoute;
            this.bgpConfig = request.bgpConfig;
            this.clientToken = request.clientToken;
            this.customerGatewayId = request.customerGatewayId;
            this.effectImmediately = request.effectImmediately;
            this.enableDpd = request.enableDpd;
            this.enableNatTraversal = request.enableNatTraversal;
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
            this.tags = request.tags;
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
         * *   **BgpConfig.TunnelCidr**: the CIDR block of the IPsec tunnel. The CIDR block must belong to 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.
         * *   **LocalBgpIp:** the BGP IP address on the Alibaba Cloud side. This IP address must fall within the CIDR block of the IPsec tunnel.
         *  >- Before you configure BGP, we recommend that you learn about how BGP works and the limits. For more information, see [BGP dynamic routing ](~~170235~~).
         *  >- We recommend that you use a private ASN to establish a connection with Alibaba Cloud over BGP. Refer to the relevant documentation for the private ASN range.
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
         * Specifies whether to immediately start IPsec negotiations after the configuration takes effect. Valid values:
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
         * *   **false**
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
         * The health check configuration:
         * <p>
         * 
         * *   **HealthCheckConfig.enable**: specifies whether to enable health checks. Valid values: **true** and **false**. Default value: false.
         * 
         * *   **HealthCheckConfig.dip**: the destination IP address configured for health checks. Enter the IP address on the data center side that the VPC can communicate with through the IPsec-VPN connection.
         * 
         * *   **HealthCheckConfig.sip**: the source IP address configured for health checks. Enter the IP address on the VPC side that the data center can communicate with through the IPsec-VPN connection.
         * 
         * *   **HealthCheckConfig.interval**: the time interval of health check retries. Unit: seconds. Default value: **3**.
         * 
         * *   **HealthCheckConfig.retry**: the maximum number of health check retries. Default value: **3**.
         * 
         * *   **HealthCheckConfig.Policy**: specifies whether to withdraw published routes when health checks fail. Valid values:
         * 
         *     *   **revoke_route** (default): withdraws published routes.
         *     *   **reserve_route**: does not withdraw published routes.
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
         * *   **IkeConfig.Psk**: The pre-shared key that is used for authentication between the VPN gateway and the data center.
         * 
         *     *   It must be 1 to 100 characters in length, and can contain letters, digits, and the following characters: ``~!`@#$%^&*()_-+={}[]|;:\",.<>/?``
         *     *   If you do not specify a pre-shared key, the system generates a random 16-character string as the pre-shared key. You can call the [DescribeVpnConnection](~~120374~~) operation to query the pre-shared key that is generated by the system.
         * 
         *     >The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the data center. Otherwise, a connection cannot be established between the data center and the VPN gateway.
         * 
         * *   **IkeConfig.IkeVersion**: the IKE version. Valid values: **ikev1** and **ikev2**. Default value: **ikev1**.
         * 
         * *   **IkeConfig.IkeMode**: the negotiation mode. Valid values: **main** and **aggressive**. Default value: **main**.
         * 
         * *   **IkeConfig.IkeEncAlg:** the encryption algorithm that is used in Phase 1 negotiations. Valid values: **aes**, **aes192**, **aes256**, **des**, and **3des**. Default value: **aes**.
         * 
         * *   **IkeConfig.IkeAuthAlg**: the authentication algorithm that is used in Phase 1 negotiations. Valid values: **md5**, **sha1**, **sha256**, **sha384**, and **sha512**. Default value: **md5**.
         * 
         * *   **IkeConfig.IkePfs**: The Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiations. Valid values: **group1**, **group2**, **group5**, and **group14**. Default value: **group2**.
         * 
         * *   **IkeConfig.IkeLifetime**: the SA lifetime determined by Phase 1 negotiations. Unit: seconds. Valid values: **0** to **86400**. Default value: **86400**.
         * 
         * *   **IkeConfig.LocalId**: the identifier on the Alibaba Cloud side. The identifier cannot exceed 100 characters in length. This parameter is empty by default.
         * 
         * *   **IkeConfig.RemoteId**: the identifier on the data center side. The identifier cannot exceed 100 characters in length. The default value is the IP address of the customer gateway.
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
         * The CIDR block on the VPC side. The CIDR block is used in Phase 2 negotiations.
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
         * The network type of the IPsec-VPN connection. Valid values:
         * <p>
         * 
         * *   **public** (default)
         * *   **private**
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
         * The ID of the region where the IPsec-VPN connection is established.
         * <p>
         * 
         * You can call the [DescribeRegions](~~36063~~) operation to query the most recent list of regions.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The peer CA certificate when a ShangMi (SM) VPN gateway is used to create the IPsec-VPN connection.
         */
        public Builder remoteCaCert(String remoteCaCert) {
            this.putQueryParameter("RemoteCaCert", remoteCaCert);
            this.remoteCaCert = remoteCaCert;
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

        @Override
        public CreateVpnAttachmentRequest build() {
            return new CreateVpnAttachmentRequest(this);
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
}
