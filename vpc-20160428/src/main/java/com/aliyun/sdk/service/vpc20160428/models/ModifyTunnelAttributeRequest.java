// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTunnelAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyTunnelAttributeRequest</p>
 */
public class ModifyTunnelAttributeRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TunnelId")
    @Validation(required = true)
    private String tunnelId;

    @Query
    @NameInMap("TunnelOptionsSpecification")
    private TunnelOptionsSpecification tunnelOptionsSpecification;

    @Query
    @NameInMap("VpnConnectionId")
    @Validation(required = true)
    private String vpnConnectionId;

    private ModifyTunnelAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tunnelId = builder.tunnelId;
        this.tunnelOptionsSpecification = builder.tunnelOptionsSpecification;
        this.vpnConnectionId = builder.vpnConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTunnelAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return tunnelId
     */
    public String getTunnelId() {
        return this.tunnelId;
    }

    /**
     * @return tunnelOptionsSpecification
     */
    public TunnelOptionsSpecification getTunnelOptionsSpecification() {
        return this.tunnelOptionsSpecification;
    }

    /**
     * @return vpnConnectionId
     */
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public static final class Builder extends Request.Builder<ModifyTunnelAttributeRequest, Builder> {
        private String clientToken; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String tunnelId; 
        private TunnelOptionsSpecification tunnelOptionsSpecification; 
        private String vpnConnectionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTunnelAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tunnelId = request.tunnelId;
            this.tunnelOptionsSpecification = request.tunnelOptionsSpecification;
            this.vpnConnectionId = request.vpnConnectionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters. 
         * <p>
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * The region ID of the IPsec connection. You can call the [DescribeRegions](~~36063~~) operation to query the most recent list of regions.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The tunnel ID.
         */
        public Builder tunnelId(String tunnelId) {
            this.putQueryParameter("TunnelId", tunnelId);
            this.tunnelId = tunnelId;
            return this;
        }

        /**
         * The tunnel configurations.
         */
        public Builder tunnelOptionsSpecification(TunnelOptionsSpecification tunnelOptionsSpecification) {
            this.putQueryParameter("TunnelOptionsSpecification", tunnelOptionsSpecification);
            this.tunnelOptionsSpecification = tunnelOptionsSpecification;
            return this;
        }

        /**
         * The ID of the IPsec connection.
         */
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.putQueryParameter("VpnConnectionId", vpnConnectionId);
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }

        @Override
        public ModifyTunnelAttributeRequest build() {
            return new ModifyTunnelAttributeRequest(this);
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
             * The local autonomous system number (ASN). Valid values: **1** to **4294967295**.
             */
            public Builder localAsn(Long localAsn) {
                this.localAsn = localAsn;
                return this;
            }

            /**
             * The BGP IP address of the tunnel. The IP address must fall into the **CIDR block** of the tunnel.
             */
            public Builder localBgpIp(String localBgpIp) {
                this.localBgpIp = localBgpIp;
                return this;
            }

            /**
             * The CIDR block of the tunnel. The CIDR block must fall into 169.254.0.0/16. The subnet mask of the CIDR block must be 30 bits in length.
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
             * The authentication algorithm that is used in Phase 1 negotiations. 
             * <p>
             * 
             * - If the IPsec connection is attached to a standard VPN gateway, the valid values are **md5**, **sha1**, **sha256**, **sha384**, and **sha512**. 
             * - If the IPsec connection is attached to a VPN gateway that uses an SM certificate, set the value to **sm3**.
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * The encryption algorithm that is used in Phase 1 negotiations. 
             * <p>
             * 
             * - If the IPsec connection is attached to a standard VPN gateway, the valid values are **aes**, **aes192**, **sha256**, **des**, and **3des**. 
             * - If the IPsec connection is attached to a VPN gateway that uses an SM certificate, set the value to **sm4**.
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
             * - **main**: This mode offers higher security during negotiations. 
             * - **aggressive**: This mode is faster and has a higher success rate.
             */
            public Builder ikeMode(String ikeMode) {
                this.ikeMode = ikeMode;
                return this;
            }

            /**
             * The Diffie-Hellman key exchange algorithm that is used in Phase 1 negotiations. Valid values: **group1**, **group2**, **group5**, and **group14**.
             */
            public Builder ikePfs(String ikePfs) {
                this.ikePfs = ikePfs;
                return this;
            }

            /**
             * The version of the IKE protocol. Valid values: **ikev1** and **ikev2**.
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * The tunnel identifier. The identifier can be up to 100 characters in length, and supports fully qualified domain names (FQDNs) and IP addresses. The default identifier is the tunnel IP address.
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * The pre-shared key that is used to verify identities between the tunnel and peer. 
             * <p>
             * 
             * 
             * - The key must be 1 to 100 characters in length, and can contain digits, letters, and the following characters: ```~!`@#$%^&*()_-+={}[]|;:\",.<>/?```
             * - If you do not specify a pre-shared key, the system generates a random 16-bit string as the pre-shared key. You can call the DescribeVpnConnection operation to query the pre-shared key that is generated by the system. 
             * 
             * > The tunnel and the peer must use the same pre-shared key. Otherwise, tunnel communication cannot be established.
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * The peer identifier. The identifier can be up to 100 characters in length, and supports FQDNs and IP addresses. The default identifier is the IP address of the customer gateway associated with the tunnel.
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
             * The authentication algorithm that is used in Phase 2 negotiations. 
             * <p>
             * 
             * - If the IPsec connection is attached to a standard VPN gateway, the valid values are **md5**, **sha1**, **sha256**, **sha384,** and **sha512**. 
             * - If the IPsec connection is attached to a VPN gateway that uses an SM certificate, set the value to **sm3**.
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * The encryption algorithm that is used in Phase 2 negotiations. 
             * <p>
             * 
             * - If the IPsec connection is attached to a standard VPN gateway, the valid values are **aes**, **aes192**, **sha256**, **des**, and **3des**. 
             * - If the IPsec connection is attached to a VPN gateway that uses an SM certificate, set the value to **sm4**.
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * The SA lifetime that is determined by Phase 2 negotiations. Unit: seconds. Valid values: **0** to **86400**.
             */
            public Builder ipsecLifetime(Long ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * The Diffie-Hellman key exchange algorithm that is used in Phase 2 negotiations. Valid values: **disabled**, **group1**, **group2**, **group5**, and **group14**.
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
        @NameInMap("EnableDpd")
        private Boolean enableDpd;

        @NameInMap("EnableNatTraversal")
        private Boolean enableNatTraversal;

        @NameInMap("RemoteCaCertificate")
        private String remoteCaCertificate;

        @NameInMap("TunnelBgpConfig")
        private TunnelBgpConfig tunnelBgpConfig;

        @NameInMap("TunnelIkeConfig")
        private TunnelIkeConfig tunnelIkeConfig;

        @NameInMap("TunnelIpsecConfig")
        private TunnelIpsecConfig tunnelIpsecConfig;

        private TunnelOptionsSpecification(Builder builder) {
            this.enableDpd = builder.enableDpd;
            this.enableNatTraversal = builder.enableNatTraversal;
            this.remoteCaCertificate = builder.remoteCaCertificate;
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
            private Boolean enableDpd; 
            private Boolean enableNatTraversal; 
            private String remoteCaCertificate; 
            private TunnelBgpConfig tunnelBgpConfig; 
            private TunnelIkeConfig tunnelIkeConfig; 
            private TunnelIpsecConfig tunnelIpsecConfig; 

            /**
             * Specifies whether to enable the dead peer detection (DPD) feature. Valid values:
             * <p>
             * - **true**: DPD is enabled. The IPsec initiator sends DPD packets to verify the existence and availability of the IPsec peer. If no response is received from the peer within a specified period of time, the IPsec peer is considered disconnected. Then, the ISAKMP SA, IPsec SA, and IPsec tunnel are deleted. 
             * 
             * - **false**: DPD is disabled. The IPsec initiator does not send DPD packets.
             */
            public Builder enableDpd(Boolean enableDpd) {
                this.enableDpd = enableDpd;
                return this;
            }

            /**
             * Specifies whether to enable NAT traversal. Valid values:
             * <p>
             * 
             * - **true** 
             * 
             *     After NAT traversal is enabled, the initiator does not check the UDP ports during IKE negotiations and can automatically discover NAT gateway devices along the IPsec tunnel. 
             * - **false**
             */
            public Builder enableNatTraversal(Boolean enableNatTraversal) {
                this.enableNatTraversal = enableNatTraversal;
                return this;
            }

            /**
             * If you want to attach the IPsec connection to a VPN gateway that uses a ShangMi (SM) certificate, set the value to the peer CA certificate.
             */
            public Builder remoteCaCertificate(String remoteCaCertificate) {
                this.remoteCaCertificate = remoteCaCertificate;
                return this;
            }

            /**
             * The BGP configurations.
             */
            public Builder tunnelBgpConfig(TunnelBgpConfig tunnelBgpConfig) {
                this.tunnelBgpConfig = tunnelBgpConfig;
                return this;
            }

            /**
             * The IKE settings for Phase 1 negotiations.
             */
            public Builder tunnelIkeConfig(TunnelIkeConfig tunnelIkeConfig) {
                this.tunnelIkeConfig = tunnelIkeConfig;
                return this;
            }

            /**
             * The IPsec settings for Phase 2 negotiations.
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
