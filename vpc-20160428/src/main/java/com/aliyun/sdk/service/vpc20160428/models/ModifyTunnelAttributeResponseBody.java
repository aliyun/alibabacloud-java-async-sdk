// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTunnelAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTunnelAttributeResponseBody</p>
 */
public class ModifyTunnelAttributeResponseBody extends TeaModel {
    @NameInMap("CustomerGatewayId")
    private String customerGatewayId;

    @NameInMap("EnableDpd")
    private Boolean enableDpd;

    @NameInMap("EnableNatTraversal")
    private Boolean enableNatTraversal;

    @NameInMap("InternetIp")
    private String internetIp;

    @NameInMap("RemoteCaCertificate")
    private String remoteCaCertificate;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Role")
    private String role;

    @NameInMap("State")
    private String state;

    @NameInMap("TunnelBgpConfig")
    private TunnelBgpConfig tunnelBgpConfig;

    @NameInMap("TunnelId")
    private String tunnelId;

    @NameInMap("TunnelIkeConfig")
    private TunnelIkeConfig tunnelIkeConfig;

    @NameInMap("TunnelIpsecConfig")
    private TunnelIpsecConfig tunnelIpsecConfig;

    @NameInMap("ZoneNo")
    private String zoneNo;

    private ModifyTunnelAttributeResponseBody(Builder builder) {
        this.customerGatewayId = builder.customerGatewayId;
        this.enableDpd = builder.enableDpd;
        this.enableNatTraversal = builder.enableNatTraversal;
        this.internetIp = builder.internetIp;
        this.remoteCaCertificate = builder.remoteCaCertificate;
        this.requestId = builder.requestId;
        this.role = builder.role;
        this.state = builder.state;
        this.tunnelBgpConfig = builder.tunnelBgpConfig;
        this.tunnelId = builder.tunnelId;
        this.tunnelIkeConfig = builder.tunnelIkeConfig;
        this.tunnelIpsecConfig = builder.tunnelIpsecConfig;
        this.zoneNo = builder.zoneNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTunnelAttributeResponseBody create() {
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
     * @return remoteCaCertificate
     */
    public String getRemoteCaCertificate() {
        return this.remoteCaCertificate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return tunnelIpsecConfig
     */
    public TunnelIpsecConfig getTunnelIpsecConfig() {
        return this.tunnelIpsecConfig;
    }

    /**
     * @return zoneNo
     */
    public String getZoneNo() {
        return this.zoneNo;
    }

    public static final class Builder {
        private String customerGatewayId; 
        private Boolean enableDpd; 
        private Boolean enableNatTraversal; 
        private String internetIp; 
        private String remoteCaCertificate; 
        private String requestId; 
        private String role; 
        private String state; 
        private TunnelBgpConfig tunnelBgpConfig; 
        private String tunnelId; 
        private TunnelIkeConfig tunnelIkeConfig; 
        private TunnelIpsecConfig tunnelIpsecConfig; 
        private String zoneNo; 

        /**
         * CustomerGatewayId.
         */
        public Builder customerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * EnableDpd.
         */
        public Builder enableDpd(Boolean enableDpd) {
            this.enableDpd = enableDpd;
            return this;
        }

        /**
         * EnableNatTraversal.
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
         * RemoteCaCertificate.
         */
        public Builder remoteCaCertificate(String remoteCaCertificate) {
            this.remoteCaCertificate = remoteCaCertificate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * TunnelIpsecConfig.
         */
        public Builder tunnelIpsecConfig(TunnelIpsecConfig tunnelIpsecConfig) {
            this.tunnelIpsecConfig = tunnelIpsecConfig;
            return this;
        }

        /**
         * ZoneNo.
         */
        public Builder zoneNo(String zoneNo) {
            this.zoneNo = zoneNo;
            return this;
        }

        public ModifyTunnelAttributeResponseBody build() {
            return new ModifyTunnelAttributeResponseBody(this);
        } 

    } 

    public static class TunnelBgpConfig extends TeaModel {
        @NameInMap("EnableBgp")
        private Boolean enableBgp;

        @NameInMap("LocalAsn")
        private Long localAsn;

        @NameInMap("LocalBgpIp")
        private String localBgpIp;

        @NameInMap("PeerAsn")
        private Long peerAsn;

        @NameInMap("PeerBgpIp")
        private String peerBgpIp;

        @NameInMap("TunnelCidr")
        private String tunnelCidr;

        private TunnelBgpConfig(Builder builder) {
            this.enableBgp = builder.enableBgp;
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
         * @return enableBgp
         */
        public Boolean getEnableBgp() {
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
         * @return tunnelCidr
         */
        public String getTunnelCidr() {
            return this.tunnelCidr;
        }

        public static final class Builder {
            private Boolean enableBgp; 
            private Long localAsn; 
            private String localBgpIp; 
            private Long peerAsn; 
            private String peerBgpIp; 
            private String tunnelCidr; 

            /**
             * EnableBgp.
             */
            public Builder enableBgp(Boolean enableBgp) {
                this.enableBgp = enableBgp;
                return this;
            }

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
             * IkeAuthAlg.
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * IkeEncAlg.
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * IkeLifetime.
             */
            public Builder ikeLifetime(Long ikeLifetime) {
                this.ikeLifetime = ikeLifetime;
                return this;
            }

            /**
             * IkeMode.
             */
            public Builder ikeMode(String ikeMode) {
                this.ikeMode = ikeMode;
                return this;
            }

            /**
             * IkePfs.
             */
            public Builder ikePfs(String ikePfs) {
                this.ikePfs = ikePfs;
                return this;
            }

            /**
             * IkeVersion.
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * LocalId.
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * Psk.
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * RemoteId.
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
             * IpsecAuthAlg.
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * IpsecEncAlg.
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * IpsecLifetime.
             */
            public Builder ipsecLifetime(Long ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * IpsecPfs.
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
}
