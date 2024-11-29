// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyVpnAttachmentAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVpnAttachmentAttributeResponseBody</p>
 */
public class ModifyVpnAttachmentAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttachInstanceId")
    private String attachInstanceId;

    @com.aliyun.core.annotation.NameInMap("AttachType")
    private String attachType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("CustomerGatewayId")
    private String customerGatewayId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EffectImmediately")
    private Boolean effectImmediately;

    @com.aliyun.core.annotation.NameInMap("EnableDpd")
    private Boolean enableDpd;

    @com.aliyun.core.annotation.NameInMap("EnableNatTraversal")
    private Boolean enableNatTraversal;

    @com.aliyun.core.annotation.NameInMap("EnableTunnelsBgp")
    private Boolean enableTunnelsBgp;

    @com.aliyun.core.annotation.NameInMap("IkeConfig")
    private IkeConfig ikeConfig;

    @com.aliyun.core.annotation.NameInMap("IpsecConfig")
    private IpsecConfig ipsecConfig;

    @com.aliyun.core.annotation.NameInMap("LocalSubnet")
    private String localSubnet;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("RemoteSubnet")
    private String remoteSubnet;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TunnelOptionsSpecification")
    private java.util.List < TunnelOptionsSpecification> tunnelOptionsSpecification;

    @com.aliyun.core.annotation.NameInMap("VcoHealthCheck")
    private VcoHealthCheck vcoHealthCheck;

    @com.aliyun.core.annotation.NameInMap("VpnBgpConfig")
    private VpnBgpConfig vpnBgpConfig;

    @com.aliyun.core.annotation.NameInMap("VpnConnectionId")
    private String vpnConnectionId;

    @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    private ModifyVpnAttachmentAttributeResponseBody(Builder builder) {
        this.attachInstanceId = builder.attachInstanceId;
        this.attachType = builder.attachType;
        this.createTime = builder.createTime;
        this.customerGatewayId = builder.customerGatewayId;
        this.description = builder.description;
        this.effectImmediately = builder.effectImmediately;
        this.enableDpd = builder.enableDpd;
        this.enableNatTraversal = builder.enableNatTraversal;
        this.enableTunnelsBgp = builder.enableTunnelsBgp;
        this.ikeConfig = builder.ikeConfig;
        this.ipsecConfig = builder.ipsecConfig;
        this.localSubnet = builder.localSubnet;
        this.name = builder.name;
        this.networkType = builder.networkType;
        this.remoteSubnet = builder.remoteSubnet;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.spec = builder.spec;
        this.status = builder.status;
        this.tunnelOptionsSpecification = builder.tunnelOptionsSpecification;
        this.vcoHealthCheck = builder.vcoHealthCheck;
        this.vpnBgpConfig = builder.vpnBgpConfig;
        this.vpnConnectionId = builder.vpnConnectionId;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpnAttachmentAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return attachInstanceId
     */
    public String getAttachInstanceId() {
        return this.attachInstanceId;
    }

    /**
     * @return attachType
     */
    public String getAttachType() {
        return this.attachType;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return customerGatewayId
     */
    public String getCustomerGatewayId() {
        return this.customerGatewayId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return ikeConfig
     */
    public IkeConfig getIkeConfig() {
        return this.ikeConfig;
    }

    /**
     * @return ipsecConfig
     */
    public IpsecConfig getIpsecConfig() {
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
     * @return remoteSubnet
     */
    public String getRemoteSubnet() {
        return this.remoteSubnet;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tunnelOptionsSpecification
     */
    public java.util.List < TunnelOptionsSpecification> getTunnelOptionsSpecification() {
        return this.tunnelOptionsSpecification;
    }

    /**
     * @return vcoHealthCheck
     */
    public VcoHealthCheck getVcoHealthCheck() {
        return this.vcoHealthCheck;
    }

    /**
     * @return vpnBgpConfig
     */
    public VpnBgpConfig getVpnBgpConfig() {
        return this.vpnBgpConfig;
    }

    /**
     * @return vpnConnectionId
     */
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder {
        private String attachInstanceId; 
        private String attachType; 
        private Long createTime; 
        private String customerGatewayId; 
        private String description; 
        private Boolean effectImmediately; 
        private Boolean enableDpd; 
        private Boolean enableNatTraversal; 
        private Boolean enableTunnelsBgp; 
        private IkeConfig ikeConfig; 
        private IpsecConfig ipsecConfig; 
        private String localSubnet; 
        private String name; 
        private String networkType; 
        private String remoteSubnet; 
        private String requestId; 
        private String resourceGroupId; 
        private String spec; 
        private String status; 
        private java.util.List < TunnelOptionsSpecification> tunnelOptionsSpecification; 
        private VcoHealthCheck vcoHealthCheck; 
        private VpnBgpConfig vpnBgpConfig; 
        private String vpnConnectionId; 
        private String vpnGatewayId; 

        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance to which the transit router associated with the IPsec-VPN connection belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-c2r3m3zxkumoqz****</p>
         */
        public Builder attachInstanceId(String attachInstanceId) {
            this.attachInstanceId = attachInstanceId;
            return this;
        }

        /**
         * <p>The type of the resource that is associated with the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>CEN</strong>: The IPsec-VPN connection is associated with a transit router.</li>
         * <li><strong>VPNGW</strong>: The IPsec-VPN connection is associated with a VPN gateway.</li>
         * <li><strong>NO_ASSOCIATED</strong>: The IPsec-VPN connection is not associated with any resource.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CEN</p>
         */
        public Builder attachType(String attachType) {
            this.attachType = attachType;
            return this;
        }

        /**
         * <p>The timestamp generated when the IPsec-VPN connection was established. Unit: milliseconds.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1658201810000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The ID of the customer gateway associated with the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>cgw-p0w2jemrcj5u61un8****</p>
         */
        public Builder customerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * <p>The description of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether IPsec negotiations immediately start after the configuration takes effect. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder effectImmediately(Boolean effectImmediately) {
            this.effectImmediately = effectImmediately;
            return this;
        }

        /**
         * <p>Indicates whether the DPD feature is enabled for the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>Indicates whether NAT traversal is enabled for the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * EnableTunnelsBgp.
         */
        public Builder enableTunnelsBgp(Boolean enableTunnelsBgp) {
            this.enableTunnelsBgp = enableTunnelsBgp;
            return this;
        }

        /**
         * <p>The configuration of Phase 1 negotiations.</p>
         */
        public Builder ikeConfig(IkeConfig ikeConfig) {
            this.ikeConfig = ikeConfig;
            return this;
        }

        /**
         * <p>The configuration of Phase 2 negotiations.</p>
         */
        public Builder ipsecConfig(IpsecConfig ipsecConfig) {
            this.ipsecConfig = ipsecConfig;
            return this;
        }

        /**
         * <p>The CIDR block of the VPC with which the data center can communicate.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.1.0/24,10.1.2.0/24</p>
         */
        public Builder localSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }

        /**
         * <p>The name of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder name(String name) {
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
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The CIDR block of the data center with which the VPC can communicate.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.3.0/24,10.1.4.0/24</p>
         */
        public Builder remoteSubnet(String remoteSubnet) {
            this.remoteSubnet = remoteSubnet;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35822A84-867F-3936-A2E6-A4C4E3ED11C0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the IPsec-VPN connection belongs.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query resource groups.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzs372yg****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The bandwidth specification of the IPsec-VPN connection.</p>
         * <p>A value of <strong>M</strong> in the response indicates <strong>Mbit/s</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000M</p>
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        /**
         * <p>The state of the IPsec-VPN connection. Valid values:</p>
         * <ul>
         * <li><strong>ike_sa_not_established</strong>: Phase 1 negotiations failed.</li>
         * <li><strong>ike_sa_established</strong>: Phase 1 negotiations succeeded.</li>
         * <li><strong>ipsec_sa_not_established</strong>: Phase 2 negotiations failed.</li>
         * <li><strong>ipsec_sa_established</strong>: Phase 2 negotiations succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ike_sa_not_established</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * TunnelOptionsSpecification.
         */
        public Builder tunnelOptionsSpecification(java.util.List < TunnelOptionsSpecification> tunnelOptionsSpecification) {
            this.tunnelOptionsSpecification = tunnelOptionsSpecification;
            return this;
        }

        /**
         * <p>The health check configuration of the IPsec-VPN connection.</p>
         */
        public Builder vcoHealthCheck(VcoHealthCheck vcoHealthCheck) {
            this.vcoHealthCheck = vcoHealthCheck;
            return this;
        }

        /**
         * <p>The BGP configuration of the IPsec-VPN connection.</p>
         */
        public Builder vpnBgpConfig(VpnBgpConfig vpnBgpConfig) {
            this.vpnBgpConfig = vpnBgpConfig;
            return this;
        }

        /**
         * <p>The ID of the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vco-p0w5112fgnl2ihlmf****</p>
         */
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }

        /**
         * <p>The ID of the VPN gateway associated with the IPsec-VPN connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vpn-p0wa1c1018pmeb6cu****</p>
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        public ModifyVpnAttachmentAttributeResponseBody build() {
            return new ModifyVpnAttachmentAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyVpnAttachmentAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyVpnAttachmentAttributeResponseBody</p>
     */
    public static class IkeConfig extends TeaModel {
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

        private IkeConfig(Builder builder) {
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

        public static IkeConfig create() {
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
             * <p>The authentication algorithm that is used in Phase 1 negotiations.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm that is used in Phase 1 negotiations.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * <p>The SA lifetime that is determined by Phase 1 negotiations. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ikeLifetime(Long ikeLifetime) {
                this.ikeLifetime = ikeLifetime;
                return this;
            }

            /**
             * <p>The negotiation mode.</p>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder ikeMode(String ikeMode) {
                this.ikeMode = ikeMode;
                return this;
            }

            /**
             * <p>The DH key exchange algorithm that is used in Phase 1 negotiations.</p>
             * 
             * <strong>example:</strong>
             * <p>group2</p>
             */
            public Builder ikePfs(String ikePfs) {
                this.ikePfs = ikePfs;
                return this;
            }

            /**
             * <p>The version of the IKE protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>ikev1</p>
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * <p>The identifier of the IPsec-VPN connection on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>47.XX.XX.1</p>
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * <p>The pre-shared key that is used for identity authentication between the VPN gateway and the data center.</p>
             * <blockquote>
             * <p> The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the data center. Otherwise, you cannot establish a connection between the data center and the VPN gateway.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1234***</p>
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * <p>The identifier of the IPsec-VPN connection on the data center side.</p>
             * 
             * <strong>example:</strong>
             * <p>47.XX.XX.2</p>
             */
            public Builder remoteId(String remoteId) {
                this.remoteId = remoteId;
                return this;
            }

            public IkeConfig build() {
                return new IkeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyVpnAttachmentAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyVpnAttachmentAttributeResponseBody</p>
     */
    public static class IpsecConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpsecAuthAlg")
        private String ipsecAuthAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecEncAlg")
        private String ipsecEncAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecLifetime")
        private Long ipsecLifetime;

        @com.aliyun.core.annotation.NameInMap("IpsecPfs")
        private String ipsecPfs;

        private IpsecConfig(Builder builder) {
            this.ipsecAuthAlg = builder.ipsecAuthAlg;
            this.ipsecEncAlg = builder.ipsecEncAlg;
            this.ipsecLifetime = builder.ipsecLifetime;
            this.ipsecPfs = builder.ipsecPfs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpsecConfig create() {
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
             * <p>The authentication algorithm that is used in Phase 2 negotiations.</p>
             * 
             * <strong>example:</strong>
             * <p>md5</p>
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm that is used in Phase 2 negotiations.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * <p>The SA lifetime that is determined by Phase 2 negotiations. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ipsecLifetime(Long ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * <p>The DH key exchange algorithm that is used in Phase 2 negotiations.</p>
             * 
             * <strong>example:</strong>
             * <p>group2</p>
             */
            public Builder ipsecPfs(String ipsecPfs) {
                this.ipsecPfs = ipsecPfs;
                return this;
            }

            public IpsecConfig build() {
                return new IpsecConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyVpnAttachmentAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyVpnAttachmentAttributeResponseBody</p>
     */
    public static class TunnelBgpConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LocalAsn")
        private Long localAsn;

        @com.aliyun.core.annotation.NameInMap("LocalBgpIp")
        private String localBgpIp;

        @com.aliyun.core.annotation.NameInMap("PeerAsn")
        private Long peerAsn;

        @com.aliyun.core.annotation.NameInMap("PeerBgpIp")
        private String peerBgpIp;

        @com.aliyun.core.annotation.NameInMap("TunnelCidr")
        private String tunnelCidr;

        private TunnelBgpConfig(Builder builder) {
            this.localAsn = builder.localAsn;
            this.localBgpIp = builder.localBgpIp;
            this.peerAsn = builder.peerAsn;
            this.peerBgpIp = builder.peerBgpIp;
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
         * @return peerAsn
         */
        public Long getPeerAsn() {
            return this.peerAsn;
        }

        /**
         * @return peerBgpIp
         */
        public String getPeerBgpIp() {
            return this.peerBgpIp;
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
            private Long peerAsn; 
            private String peerBgpIp; 
            private String tunnelCidr; 

            /**
             * LocalAsn.
             */
            public Builder localAsn(Long localAsn) {
                this.localAsn = localAsn;
                return this;
            }

            /**
             * LocalBgpIp.
             */
            public Builder localBgpIp(String localBgpIp) {
                this.localBgpIp = localBgpIp;
                return this;
            }

            /**
             * PeerAsn.
             */
            public Builder peerAsn(Long peerAsn) {
                this.peerAsn = peerAsn;
                return this;
            }

            /**
             * PeerBgpIp.
             */
            public Builder peerBgpIp(String peerBgpIp) {
                this.peerBgpIp = peerBgpIp;
                return this;
            }

            /**
             * TunnelCidr.
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
     * {@link ModifyVpnAttachmentAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyVpnAttachmentAttributeResponseBody</p>
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

            /**
             * <p>The authentication algorithm that is used in Phase 1 negotiations.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm that is used in Phase 1 negotiations.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * <p>The SA lifetime that is determined by Phase 1 negotiations. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ikeLifetime(Long ikeLifetime) {
                this.ikeLifetime = ikeLifetime;
                return this;
            }

            /**
             * <p>The negotiation mode.</p>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder ikeMode(String ikeMode) {
                this.ikeMode = ikeMode;
                return this;
            }

            /**
             * <p>The DH key exchange algorithm that is used in Phase 1 negotiations.</p>
             * 
             * <strong>example:</strong>
             * <p>group2</p>
             */
            public Builder ikePfs(String ikePfs) {
                this.ikePfs = ikePfs;
                return this;
            }

            /**
             * <p>The version of the IKE protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>ikev1</p>
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * <p>The identifier of the IPsec-VPN connection on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>47.XX.XX.1</p>
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * <p>The pre-shared key that is used for identity authentication between the VPN gateway and the data center.</p>
             * <blockquote>
             * <p> The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the data center. Otherwise, you cannot establish a connection between the data center and the VPN gateway.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1234***</p>
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * <p>The identifier of the IPsec-VPN connection on the data center side.</p>
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
     * {@link ModifyVpnAttachmentAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyVpnAttachmentAttributeResponseBody</p>
     */
    public static class TunnelIpsecConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpsecAuthAlg")
        private String ipsecAuthAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecEncAlg")
        private String ipsecEncAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecLifetime")
        private Long ipsecLifetime;

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
             * <p>The authentication algorithm that is used in Phase 2 negotiations.</p>
             * 
             * <strong>example:</strong>
             * <p>md5</p>
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm that is used in Phase 2 negotiations.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * <p>The SA lifetime that is determined by Phase 2 negotiations. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ipsecLifetime(Long ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * <p>The DH key exchange algorithm that is used in Phase 2 negotiations.</p>
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
     * {@link ModifyVpnAttachmentAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyVpnAttachmentAttributeResponseBody</p>
     */
    public static class TunnelOptionsSpecification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerGatewayId")
        private String customerGatewayId;

        @com.aliyun.core.annotation.NameInMap("EnableDpd")
        private Boolean enableDpd;

        @com.aliyun.core.annotation.NameInMap("EnableNatTraversal")
        private Boolean enableNatTraversal;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

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
            this.internetIp = builder.internetIp;
            this.role = builder.role;
            this.state = builder.state;
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
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
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
            private String internetIp; 
            private String role; 
            private String state; 
            private TunnelBgpConfig tunnelBgpConfig; 
            private String tunnelId; 
            private TunnelIkeConfig tunnelIkeConfig; 
            private Integer tunnelIndex; 
            private TunnelIpsecConfig tunnelIpsecConfig; 

            /**
             * <p>The ID of the customer gateway associated with the IPsec-VPN connection.</p>
             * 
             * <strong>example:</strong>
             * <p>cgw-p0w2jemrcj5u61un8****</p>
             */
            public Builder customerGatewayId(String customerGatewayId) {
                this.customerGatewayId = customerGatewayId;
                return this;
            }

            /**
             * <p>Indicates whether the DPD feature is enabled for the IPsec-VPN connection. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * <p>Indicates whether NAT traversal is enabled for the IPsec-VPN connection. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
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
             * InternetIp.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TunnelBgpConfig.
             */
            public Builder tunnelBgpConfig(TunnelBgpConfig tunnelBgpConfig) {
                this.tunnelBgpConfig = tunnelBgpConfig;
                return this;
            }

            /**
             * TunnelId.
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            /**
             * TunnelIkeConfig.
             */
            public Builder tunnelIkeConfig(TunnelIkeConfig tunnelIkeConfig) {
                this.tunnelIkeConfig = tunnelIkeConfig;
                return this;
            }

            /**
             * TunnelIndex.
             */
            public Builder tunnelIndex(Integer tunnelIndex) {
                this.tunnelIndex = tunnelIndex;
                return this;
            }

            /**
             * TunnelIpsecConfig.
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
    /**
     * 
     * {@link ModifyVpnAttachmentAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyVpnAttachmentAttributeResponseBody</p>
     */
    public static class VcoHealthCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dip")
        private String dip;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private String enable;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Retry")
        private Integer retry;

        @com.aliyun.core.annotation.NameInMap("Sip")
        private String sip;

        private VcoHealthCheck(Builder builder) {
            this.dip = builder.dip;
            this.enable = builder.enable;
            this.interval = builder.interval;
            this.policy = builder.policy;
            this.retry = builder.retry;
            this.sip = builder.sip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VcoHealthCheck create() {
            return builder().build();
        }

        /**
         * @return dip
         */
        public String getDip() {
            return this.dip;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return retry
         */
        public Integer getRetry() {
            return this.retry;
        }

        /**
         * @return sip
         */
        public String getSip() {
            return this.sip;
        }

        public static final class Builder {
            private String dip; 
            private String enable; 
            private Integer interval; 
            private String policy; 
            private Integer retry; 
            private String sip; 

            /**
             * <p>The destination IP address that is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.1</p>
             */
            public Builder dip(String dip) {
                this.dip = dip;
                return this;
            }

            /**
             * <p>Indicates whether the health check feature is enabled for the IPsec-VPN connection. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The interval between two consecutive health check retries. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>Indicates whether advertised routes are withdrawn when the health check fails. Valid values:</p>
             * <ul>
             * <li><strong>revoke_route</strong>: Advertised routes are withdrawn.</li>
             * <li><strong>reserve_route</strong>: Advertised routes are not withdrawn.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>revoke_route</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The maximum number of health check retries.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder retry(Integer retry) {
                this.retry = retry;
                return this;
            }

            /**
             * <p>The source IP address that is used for health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>10.1.1.1</p>
             */
            public Builder sip(String sip) {
                this.sip = sip;
                return this;
            }

            public VcoHealthCheck build() {
                return new VcoHealthCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyVpnAttachmentAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyVpnAttachmentAttributeResponseBody</p>
     */
    public static class VpnBgpConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableBgp")
        private String enableBgp;

        @com.aliyun.core.annotation.NameInMap("LocalAsn")
        private Long localAsn;

        @com.aliyun.core.annotation.NameInMap("LocalBgpIp")
        private String localBgpIp;

        @com.aliyun.core.annotation.NameInMap("PeerAsn")
        private Long peerAsn;

        @com.aliyun.core.annotation.NameInMap("PeerBgpIp")
        private String peerBgpIp;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TunnelCidr")
        private String tunnelCidr;

        private VpnBgpConfig(Builder builder) {
            this.enableBgp = builder.enableBgp;
            this.localAsn = builder.localAsn;
            this.localBgpIp = builder.localBgpIp;
            this.peerAsn = builder.peerAsn;
            this.peerBgpIp = builder.peerBgpIp;
            this.status = builder.status;
            this.tunnelCidr = builder.tunnelCidr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnBgpConfig create() {
            return builder().build();
        }

        /**
         * @return enableBgp
         */
        public String getEnableBgp() {
            return this.enableBgp;
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
         * @return peerAsn
         */
        public Long getPeerAsn() {
            return this.peerAsn;
        }

        /**
         * @return peerBgpIp
         */
        public String getPeerBgpIp() {
            return this.peerBgpIp;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tunnelCidr
         */
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

        public static final class Builder {
            private String enableBgp; 
            private Long localAsn; 
            private String localBgpIp; 
            private Long peerAsn; 
            private String peerBgpIp; 
            private String status; 
            private String tunnelCidr; 

            /**
             * <p>Indicates whether BGP is enabled for the IPsec-VPN connection. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableBgp(String enableBgp) {
                this.enableBgp = enableBgp;
                return this;
            }

            /**
             * <p>The ASN on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>45104</p>
             */
            public Builder localAsn(Long localAsn) {
                this.localAsn = localAsn;
                return this;
            }

            /**
             * <p>The BGP IP address on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.11.1</p>
             */
            public Builder localBgpIp(String localBgpIp) {
                this.localBgpIp = localBgpIp;
                return this;
            }

            /**
             * <p>The ASN on the data center side.</p>
             * 
             * <strong>example:</strong>
             * <p>65535</p>
             */
            public Builder peerAsn(Long peerAsn) {
                this.peerAsn = peerAsn;
                return this;
            }

            /**
             * <p>The BGP IP address on the data center side.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.11.2</p>
             */
            public Builder peerBgpIp(String peerBgpIp) {
                this.peerBgpIp = peerBgpIp;
                return this;
            }

            /**
             * <p>The negotiation state of BGP. Valid values:</p>
             * <ul>
             * <li><strong>success</strong>: normal</li>
             * <li><strong>false</strong>: abnormal</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The CIDR block of the IPsec tunnel.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.11.0/30</p>
             */
            public Builder tunnelCidr(String tunnelCidr) {
                this.tunnelCidr = tunnelCidr;
                return this;
            }

            public VpnBgpConfig build() {
                return new VpnBgpConfig(this);
            } 

        } 

    }
}
