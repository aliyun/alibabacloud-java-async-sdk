// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpnAttachmentAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVpnAttachmentAttributeResponseBody</p>
 */
public class ModifyVpnAttachmentAttributeResponseBody extends TeaModel {
    @NameInMap("AttachInstanceId")
    private String attachInstanceId;

    @NameInMap("AttachType")
    private String attachType;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("CustomerGatewayId")
    private String customerGatewayId;

    @NameInMap("Description")
    private String description;

    @NameInMap("EffectImmediately")
    private Boolean effectImmediately;

    @NameInMap("EnableDpd")
    private Boolean enableDpd;

    @NameInMap("EnableNatTraversal")
    private Boolean enableNatTraversal;

    @NameInMap("IkeConfig")
    private IkeConfig ikeConfig;

    @NameInMap("IpsecConfig")
    private IpsecConfig ipsecConfig;

    @NameInMap("LocalSubnet")
    private String localSubnet;

    @NameInMap("Name")
    private String name;

    @NameInMap("NetworkType")
    private String networkType;

    @NameInMap("RemoteSubnet")
    private String remoteSubnet;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("Spec")
    private String spec;

    @NameInMap("Status")
    private String status;

    @NameInMap("VcoHealthCheck")
    private VcoHealthCheck vcoHealthCheck;

    @NameInMap("VpnBgpConfig")
    private VpnBgpConfig vpnBgpConfig;

    @NameInMap("VpnConnectionId")
    private String vpnConnectionId;

    @NameInMap("VpnGatewayId")
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
        private VcoHealthCheck vcoHealthCheck; 
        private VpnBgpConfig vpnBgpConfig; 
        private String vpnConnectionId; 
        private String vpnGatewayId; 

        /**
         * The ID of the Cloud Enterprise Network (CEN) instance to which the transit router associated with the IPsec-VPN connection belongs.
         */
        public Builder attachInstanceId(String attachInstanceId) {
            this.attachInstanceId = attachInstanceId;
            return this;
        }

        /**
         * The type of the resource that is associated with the IPsec-VPN connection. Valid values:
         * <p>
         * 
         * *   **CEN**: The IPsec-VPN connection is associated with a transit router.
         * *   **VPNGW**: The IPsec-VPN connection is associated with a VPN gateway.
         * *   **NO_ASSOCIATED**: The IPsec-VPN connection is not associated with any resource.
         */
        public Builder attachType(String attachType) {
            this.attachType = attachType;
            return this;
        }

        /**
         * The timestamp generated when the IPsec-VPN connection was established. Unit: milliseconds.
         * <p>
         * 
         * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The ID of the customer gateway associated with the IPsec-VPN connection.
         */
        public Builder customerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * The description of the IPsec-VPN connection.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Indicates whether IPsec negotiations immediately start after the configuration takes effect. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder effectImmediately(Boolean effectImmediately) {
            this.effectImmediately = effectImmediately;
            return this;
        }

        /**
         * Indicates whether the DPD feature is enabled for the IPsec-VPN connection. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder enableDpd(Boolean enableDpd) {
            this.enableDpd = enableDpd;
            return this;
        }

        /**
         * Indicates whether NAT traversal is enabled for the IPsec-VPN connection. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder enableNatTraversal(Boolean enableNatTraversal) {
            this.enableNatTraversal = enableNatTraversal;
            return this;
        }

        /**
         * The configuration of Phase 1 negotiations.
         */
        public Builder ikeConfig(IkeConfig ikeConfig) {
            this.ikeConfig = ikeConfig;
            return this;
        }

        /**
         * The configuration of Phase 2 negotiations.
         */
        public Builder ipsecConfig(IpsecConfig ipsecConfig) {
            this.ipsecConfig = ipsecConfig;
            return this;
        }

        /**
         * The CIDR block of the VPC with which the data center can communicate.
         */
        public Builder localSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }

        /**
         * The name of the IPsec-VPN connection.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The network type of the IPsec-VPN connection. Valid values:
         * <p>
         * 
         * *   **public**: an encrypted connection over the Internet
         * *   **private**: an encrypted connection over private networks
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * The CIDR block of the data center with which the VPC can communicate.
         */
        public Builder remoteSubnet(String remoteSubnet) {
            this.remoteSubnet = remoteSubnet;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group to which the IPsec-VPN connection belongs.
         * <p>
         * 
         * You can call the [ListResourceGroups](~~158855~~) operation to query the resource group information.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The bandwidth specification of the IPsec-VPN connection.
         * <p>
         * 
         * A value of **M** in the response indicates **Mbit/s**.
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        /**
         * The state of the IPsec-VPN connection. Valid values:
         * <p>
         * 
         * *   **ike_sa_not_established**: Phase 1 negotiations failed.
         * *   **ike_sa_established**: Phase 1 negotiations succeeded.
         * *   **ipsec_sa_not_established**: Phase 2 negotiations failed.
         * *   **ipsec_sa_established**: Phase 2 negotiations succeeded.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The health check configuration of the IPsec-VPN connection.
         */
        public Builder vcoHealthCheck(VcoHealthCheck vcoHealthCheck) {
            this.vcoHealthCheck = vcoHealthCheck;
            return this;
        }

        /**
         * The BGP configuration of the IPsec-VPN connection.
         */
        public Builder vpnBgpConfig(VpnBgpConfig vpnBgpConfig) {
            this.vpnBgpConfig = vpnBgpConfig;
            return this;
        }

        /**
         * The ID of the IPsec-VPN connection.
         */
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }

        /**
         * The ID of the VPN gateway associated with the IPsec-VPN connection.
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        public ModifyVpnAttachmentAttributeResponseBody build() {
            return new ModifyVpnAttachmentAttributeResponseBody(this);
        } 

    } 

    public static class IkeConfig extends TeaModel {
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
             * The authentication algorithm that is used in Phase 1 negotiations.
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * The encryption algorithm that is used in Phase 1 negotiations.
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * The SA lifetime that is determined by Phase 1 negotiations. Unit: seconds.
             */
            public Builder ikeLifetime(Long ikeLifetime) {
                this.ikeLifetime = ikeLifetime;
                return this;
            }

            /**
             * The negotiation mode.
             */
            public Builder ikeMode(String ikeMode) {
                this.ikeMode = ikeMode;
                return this;
            }

            /**
             * The DH key exchange algorithm that is used in Phase 1 negotiations.
             */
            public Builder ikePfs(String ikePfs) {
                this.ikePfs = ikePfs;
                return this;
            }

            /**
             * The version of the IKE protocol.
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * The identifier of the IPsec-VPN connection on the Alibaba Cloud side.
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * The pre-shared key that is used for identity authentication between the VPN gateway and the data center.
             * <p>
             * 
             * >  The pre-shared key of the IPsec-VPN connection must be the same as the authentication key of the data center. Otherwise, you cannot establish a connection between the data center and the VPN gateway.
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * The identifier of the IPsec-VPN connection on the data center side.
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
    public static class IpsecConfig extends TeaModel {
        @NameInMap("IpsecAuthAlg")
        private String ipsecAuthAlg;

        @NameInMap("IpsecEncAlg")
        private String ipsecEncAlg;

        @NameInMap("IpsecLifetime")
        private Long ipsecLifetime;

        @NameInMap("IpsecPfs")
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
             * The authentication algorithm that is used in Phase 2 negotiations.
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * The encryption algorithm that is used in Phase 2 negotiations.
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * The SA lifetime that is determined by Phase 2 negotiations. Unit: seconds.
             */
            public Builder ipsecLifetime(Long ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * The DH key exchange algorithm that is used in Phase 2 negotiations.
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
    public static class VcoHealthCheck extends TeaModel {
        @NameInMap("Dip")
        private String dip;

        @NameInMap("Enable")
        private String enable;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Retry")
        private Integer retry;

        @NameInMap("Sip")
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
             * The destination IP address that is used for health checks.
             */
            public Builder dip(String dip) {
                this.dip = dip;
                return this;
            }

            /**
             * Indicates whether the health check feature is enabled for the IPsec-VPN connection. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The interval between two consecutive health check retries. Unit: seconds.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Indicates whether advertised routes are withdrawn when the health check fails. Valid values:
             * <p>
             * 
             * *   **revoke_route**: Advertised routes are withdrawn.
             * *   **reserve_route**: Advertised routes are not withdrawn.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * The maximum number of health check retries.
             */
            public Builder retry(Integer retry) {
                this.retry = retry;
                return this;
            }

            /**
             * The source IP address that is used for health checks.
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
    public static class VpnBgpConfig extends TeaModel {
        @NameInMap("EnableBgp")
        private String enableBgp;

        @NameInMap("LocalAsn")
        private Long localAsn;

        @NameInMap("LocalBgpIp")
        private String localBgpIp;

        @NameInMap("PeerAsn")
        private Long peerAsn;

        @NameInMap("PeerBgpIp")
        private String peerBgpIp;

        @NameInMap("Status")
        private String status;

        @NameInMap("TunnelCidr")
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
             * Indicates whether BGP is enabled for the IPsec-VPN connection. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enableBgp(String enableBgp) {
                this.enableBgp = enableBgp;
                return this;
            }

            /**
             * The ASN on the Alibaba Cloud side.
             */
            public Builder localAsn(Long localAsn) {
                this.localAsn = localAsn;
                return this;
            }

            /**
             * The BGP IP address on the Alibaba Cloud side.
             */
            public Builder localBgpIp(String localBgpIp) {
                this.localBgpIp = localBgpIp;
                return this;
            }

            /**
             * The ASN on the data center side.
             */
            public Builder peerAsn(Long peerAsn) {
                this.peerAsn = peerAsn;
                return this;
            }

            /**
             * The BGP IP address on the data center side.
             */
            public Builder peerBgpIp(String peerBgpIp) {
                this.peerBgpIp = peerBgpIp;
                return this;
            }

            /**
             * The negotiation state of BGP. Valid values:
             * <p>
             * 
             * *   **success**: normal
             * *   **false**: abnormal
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The CIDR block of the IPsec tunnel.
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
