// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadVpnConnectionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadVpnConnectionConfigResponseBody</p>
 */
public class DownloadVpnConnectionConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpnConnectionConfig")
    private VpnConnectionConfig vpnConnectionConfig;

    private DownloadVpnConnectionConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vpnConnectionConfig = builder.vpnConnectionConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadVpnConnectionConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vpnConnectionConfig
     */
    public VpnConnectionConfig getVpnConnectionConfig() {
        return this.vpnConnectionConfig;
    }

    public static final class Builder {
        private String requestId; 
        private VpnConnectionConfig vpnConnectionConfig; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The configurations of the peer gateway device.
         */
        public Builder vpnConnectionConfig(VpnConnectionConfig vpnConnectionConfig) {
            this.vpnConnectionConfig = vpnConnectionConfig;
            return this;
        }

        public DownloadVpnConnectionConfigResponseBody build() {
            return new DownloadVpnConnectionConfigResponseBody(this);
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
             * The authentication algorithm in the IKE phase.
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * The encryption algorithm in the IKE phase.
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * The lifetime in the IKE phase. Unit: seconds.
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
             * The DH group in the IKE phase.
             */
            public Builder ikePfs(String ikePfs) {
                this.ikePfs = ikePfs;
                return this;
            }

            /**
             * The IKE version.
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * The identifier of the customer gateway. FQDN and IP formats are supported. The default value is the IP address of the customer gateway.
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * The pre-shared key.
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * The identifier of the VPN gateway. FQDN and IP formats are supported. The default value is the IP address of the VPN gateway.
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
             * The authentication algorithm in the IPsec phase.
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * The encryption algorithm in the IPsec phase.
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * The lifetime in the IPsec phase. Unit: seconds.
             */
            public Builder ipsecLifetime(Long ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * The DH group in the IPsec phase.
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
    public static class TunnelConfigIkeConfig extends TeaModel {
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

        private TunnelConfigIkeConfig(Builder builder) {
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

        public static TunnelConfigIkeConfig create() {
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
             * The authentication algorithm in the IKE phase.
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * The encryption algorithm in the IKE phase.
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * The lifetime in the IKE phase. Unit: seconds.
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
             * The DH group in the IKE phase.
             */
            public Builder ikePfs(String ikePfs) {
                this.ikePfs = ikePfs;
                return this;
            }

            /**
             * The IKE version.
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * The identifier of the tunnel on the data center side.
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * The pre-shared key.
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * The identifier of the tunnel on the Alibaba Cloud side.
             */
            public Builder remoteId(String remoteId) {
                this.remoteId = remoteId;
                return this;
            }

            public TunnelConfigIkeConfig build() {
                return new TunnelConfigIkeConfig(this);
            } 

        } 

    }
    public static class TunnelConfigIpsecConfig extends TeaModel {
        @NameInMap("IpsecAuthAlg")
        private String ipsecAuthAlg;

        @NameInMap("IpsecEncAlg")
        private String ipsecEncAlg;

        @NameInMap("IpsecLifetime")
        private Long ipsecLifetime;

        @NameInMap("IpsecPfs")
        private String ipsecPfs;

        private TunnelConfigIpsecConfig(Builder builder) {
            this.ipsecAuthAlg = builder.ipsecAuthAlg;
            this.ipsecEncAlg = builder.ipsecEncAlg;
            this.ipsecLifetime = builder.ipsecLifetime;
            this.ipsecPfs = builder.ipsecPfs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelConfigIpsecConfig create() {
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
             * The authentication algorithm in the IPsec phase.
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * The encryption algorithm in the IPsec phase.
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * The lifetime in the IPsec phase. Unit: seconds.
             */
            public Builder ipsecLifetime(Long ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * The DH group in the IPsec phase.
             */
            public Builder ipsecPfs(String ipsecPfs) {
                this.ipsecPfs = ipsecPfs;
                return this;
            }

            public TunnelConfigIpsecConfig build() {
                return new TunnelConfigIpsecConfig(this);
            } 

        } 

    }
    public static class TunnelConfig extends TeaModel {
        @NameInMap("IkeConfig")
        private TunnelConfigIkeConfig ikeConfig;

        @NameInMap("IpsecConfig")
        private TunnelConfigIpsecConfig ipsecConfig;

        @NameInMap("Local")
        private String local;

        @NameInMap("Remote")
        private String remote;

        @NameInMap("TunnelId")
        private String tunnelId;

        private TunnelConfig(Builder builder) {
            this.ikeConfig = builder.ikeConfig;
            this.ipsecConfig = builder.ipsecConfig;
            this.local = builder.local;
            this.remote = builder.remote;
            this.tunnelId = builder.tunnelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelConfig create() {
            return builder().build();
        }

        /**
         * @return ikeConfig
         */
        public TunnelConfigIkeConfig getIkeConfig() {
            return this.ikeConfig;
        }

        /**
         * @return ipsecConfig
         */
        public TunnelConfigIpsecConfig getIpsecConfig() {
            return this.ipsecConfig;
        }

        /**
         * @return local
         */
        public String getLocal() {
            return this.local;
        }

        /**
         * @return remote
         */
        public String getRemote() {
            return this.remote;
        }

        /**
         * @return tunnelId
         */
        public String getTunnelId() {
            return this.tunnelId;
        }

        public static final class Builder {
            private TunnelConfigIkeConfig ikeConfig; 
            private TunnelConfigIpsecConfig ipsecConfig; 
            private String local; 
            private String remote; 
            private String tunnelId; 

            /**
             * The configurations of Phase 1 negotiations.
             */
            public Builder ikeConfig(TunnelConfigIkeConfig ikeConfig) {
                this.ikeConfig = ikeConfig;
                return this;
            }

            /**
             * The configurations of Phase 2 negotiations.
             */
            public Builder ipsecConfig(TunnelConfigIpsecConfig ipsecConfig) {
                this.ipsecConfig = ipsecConfig;
                return this;
            }

            /**
             * The identifier of the tunnel on the data center side.
             */
            public Builder local(String local) {
                this.local = local;
                return this;
            }

            /**
             * The identifier of the tunnel on the Alibaba Cloud side.
             */
            public Builder remote(String remote) {
                this.remote = remote;
                return this;
            }

            /**
             * The tunnel ID.
             */
            public Builder tunnelId(String tunnelId) {
                this.tunnelId = tunnelId;
                return this;
            }

            public TunnelConfig build() {
                return new TunnelConfig(this);
            } 

        } 

    }
    public static class TunnelsConfig extends TeaModel {
        @NameInMap("TunnelConfig")
        private java.util.List < TunnelConfig> tunnelConfig;

        private TunnelsConfig(Builder builder) {
            this.tunnelConfig = builder.tunnelConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelsConfig create() {
            return builder().build();
        }

        /**
         * @return tunnelConfig
         */
        public java.util.List < TunnelConfig> getTunnelConfig() {
            return this.tunnelConfig;
        }

        public static final class Builder {
            private java.util.List < TunnelConfig> tunnelConfig; 

            /**
             * TunnelConfig.
             */
            public Builder tunnelConfig(java.util.List < TunnelConfig> tunnelConfig) {
                this.tunnelConfig = tunnelConfig;
                return this;
            }

            public TunnelsConfig build() {
                return new TunnelsConfig(this);
            } 

        } 

    }
    public static class VpnConnectionConfig extends TeaModel {
        @NameInMap("IkeConfig")
        private IkeConfig ikeConfig;

        @NameInMap("IpsecConfig")
        private IpsecConfig ipsecConfig;

        @NameInMap("Local")
        private String local;

        @NameInMap("LocalSubnet")
        private String localSubnet;

        @NameInMap("Remote")
        private String remote;

        @NameInMap("RemoteSubnet")
        private String remoteSubnet;

        @NameInMap("TunnelsConfig")
        private TunnelsConfig tunnelsConfig;

        private VpnConnectionConfig(Builder builder) {
            this.ikeConfig = builder.ikeConfig;
            this.ipsecConfig = builder.ipsecConfig;
            this.local = builder.local;
            this.localSubnet = builder.localSubnet;
            this.remote = builder.remote;
            this.remoteSubnet = builder.remoteSubnet;
            this.tunnelsConfig = builder.tunnelsConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnConnectionConfig create() {
            return builder().build();
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
         * @return local
         */
        public String getLocal() {
            return this.local;
        }

        /**
         * @return localSubnet
         */
        public String getLocalSubnet() {
            return this.localSubnet;
        }

        /**
         * @return remote
         */
        public String getRemote() {
            return this.remote;
        }

        /**
         * @return remoteSubnet
         */
        public String getRemoteSubnet() {
            return this.remoteSubnet;
        }

        /**
         * @return tunnelsConfig
         */
        public TunnelsConfig getTunnelsConfig() {
            return this.tunnelsConfig;
        }

        public static final class Builder {
            private IkeConfig ikeConfig; 
            private IpsecConfig ipsecConfig; 
            private String local; 
            private String localSubnet; 
            private String remote; 
            private String remoteSubnet; 
            private TunnelsConfig tunnelsConfig; 

            /**
             * The configurations of Phase 1 negotiations.
             */
            public Builder ikeConfig(IkeConfig ikeConfig) {
                this.ikeConfig = ikeConfig;
                return this;
            }

            /**
             * The configurations of Phase 2 negotiations.
             */
            public Builder ipsecConfig(IpsecConfig ipsecConfig) {
                this.ipsecConfig = ipsecConfig;
                return this;
            }

            /**
             * The identifier of the customer gateway.
             */
            public Builder local(String local) {
                this.local = local;
                return this;
            }

            /**
             * The CIDR block on the data center side.
             */
            public Builder localSubnet(String localSubnet) {
                this.localSubnet = localSubnet;
                return this;
            }

            /**
             * The identifier of the VPN gateway.
             */
            public Builder remote(String remote) {
                this.remote = remote;
                return this;
            }

            /**
             * The CIDR block on the virtual private cloud (VPC) side.
             */
            public Builder remoteSubnet(String remoteSubnet) {
                this.remoteSubnet = remoteSubnet;
                return this;
            }

            /**
             * The tunnel configurations of the peer gateway device.
             * <p>
             * 
             * The parameters in **TunnelsConfig** are returned only when the IPsec-VPN connection supports the dual-tunnel mode.
             */
            public Builder tunnelsConfig(TunnelsConfig tunnelsConfig) {
                this.tunnelsConfig = tunnelsConfig;
                return this;
            }

            public VpnConnectionConfig build() {
                return new VpnConnectionConfig(this);
            } 

        } 

    }
}
