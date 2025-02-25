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
 * {@link ModifyTunnelAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyTunnelAttributeResponseBody</p>
 */
public class ModifyTunnelAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomerGatewayId")
    private String customerGatewayId;

    @com.aliyun.core.annotation.NameInMap("EnableDpd")
    private Boolean enableDpd;

    @com.aliyun.core.annotation.NameInMap("EnableNatTraversal")
    private Boolean enableNatTraversal;

    @com.aliyun.core.annotation.NameInMap("InternetIp")
    private String internetIp;

    @com.aliyun.core.annotation.NameInMap("RemoteCaCertificate")
    private String remoteCaCertificate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    @com.aliyun.core.annotation.NameInMap("TunnelIpsecConfig")
    private TunnelIpsecConfig tunnelIpsecConfig;

    @com.aliyun.core.annotation.NameInMap("ZoneNo")
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
         * <p>The ID of the customer gateway associated with the customer gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>cgw-p0wx48ayhrygitm80****</p>
         */
        public Builder customerGatewayId(String customerGatewayId) {
            this.customerGatewayId = customerGatewayId;
            return this;
        }

        /**
         * <p>Indicates whether DPD is enabled. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
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
         * <p>Indicates whether NAT traversal is enabled. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
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
         * <p>The tunnel IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.XX.XX.87</p>
         */
        public Builder internetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }

        /**
         * <p>The peer CA certificate when a VPN gateway that uses an SM certificate is used to create the IPsec connection.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIB7zCCAZW**** -----END CERTIFICATE-----</p>
         */
        public Builder remoteCaCertificate(String remoteCaCertificate) {
            this.remoteCaCertificate = remoteCaCertificate;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E6F36FF0-9544-3AEE-8673-A4647D50064C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tunnel role. Valid values:</p>
         * <ul>
         * <li><strong>master</strong></li>
         * <li><strong>slave</strong></li>
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
         * <p>The tunnel status. Valid values:</p>
         * <ul>
         * <li><strong>active</strong></li>
         * <li><strong>updating</strong></li>
         * <li><strong>deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The BGP configuration.</p>
         */
        public Builder tunnelBgpConfig(TunnelBgpConfig tunnelBgpConfig) {
            this.tunnelBgpConfig = tunnelBgpConfig;
            return this;
        }

        /**
         * <p>The tunnel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tun-gbyz2e070xzo93****</p>
         */
        public Builder tunnelId(String tunnelId) {
            this.tunnelId = tunnelId;
            return this;
        }

        /**
         * <p>The Phase 1 configuration.</p>
         */
        public Builder tunnelIkeConfig(TunnelIkeConfig tunnelIkeConfig) {
            this.tunnelIkeConfig = tunnelIkeConfig;
            return this;
        }

        /**
         * <p>The configurations of IPsec Phase 2.</p>
         */
        public Builder tunnelIpsecConfig(TunnelIpsecConfig tunnelIpsecConfig) {
            this.tunnelIpsecConfig = tunnelIpsecConfig;
            return this;
        }

        /**
         * <p>The tunnel zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder zoneNo(String zoneNo) {
            this.zoneNo = zoneNo;
            return this;
        }

        public ModifyTunnelAttributeResponseBody build() {
            return new ModifyTunnelAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyTunnelAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyTunnelAttributeResponseBody</p>
     */
    public static class TunnelBgpConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableBgp")
        private Boolean enableBgp;

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
             * <p>Indicates whether the BGP feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableBgp(Boolean enableBgp) {
                this.enableBgp = enableBgp;
                return this;
            }

            /**
             * <p>The local ASN.</p>
             * 
             * <strong>example:</strong>
             * <p>65530</p>
             */
            public Builder localAsn(Long localAsn) {
                this.localAsn = localAsn;
                return this;
            }

            /**
             * <p>The BGP IP address of the tunnel.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.11.1</p>
             */
            public Builder localBgpIp(String localBgpIp) {
                this.localBgpIp = localBgpIp;
                return this;
            }

            /**
             * <p>The peer ASN.</p>
             * 
             * <strong>example:</strong>
             * <p>65531</p>
             */
            public Builder peerAsn(Long peerAsn) {
                this.peerAsn = peerAsn;
                return this;
            }

            /**
             * <p>The BGP IP address of the peer.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.11.2</p>
             */
            public Builder peerBgpIp(String peerBgpIp) {
                this.peerBgpIp = peerBgpIp;
                return this;
            }

            /**
             * <p>The CIDR block to which the tunnel BGP IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>169.254.11.0/30</p>
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
     * {@link ModifyTunnelAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyTunnelAttributeResponseBody</p>
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
             * <p>The IKE authentication algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * <p>The IKE encryption algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * <p>The IKE lifetime. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ikeLifetime(Long ikeLifetime) {
                this.ikeLifetime = ikeLifetime;
                return this;
            }

            /**
             * <p>The IKE negotiation mode.</p>
             * <ul>
             * <li><strong>main:</strong> This mode offers higher security during negotiations.</li>
             * <li><strong>aggressive</strong>: This mode is faster and has a higher success rate.</li>
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
             * <p>The DH group.</p>
             * 
             * <strong>example:</strong>
             * <p>group2</p>
             */
            public Builder ikePfs(String ikePfs) {
                this.ikePfs = ikePfs;
                return this;
            }

            /**
             * <p>The IKE version.</p>
             * <ul>
             * <li><strong>ikev1</strong></li>
             * <li><strong>ikev2</strong></li>
             * </ul>
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
             * <p>The tunnel identifier. The identifier supports FQDNs and IP addresses. The default value is the tunnel IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>47.XX.XX.87</p>
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * <p>The pre-shared key.</p>
             * 
             * <strong>example:</strong>
             * <p>123456****</p>
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * <p>The peer identifier. The identifier supports FQDNs and IP addresses. The default identifier is the IP address of the customer gateway associated with the tunnel.</p>
             * 
             * <strong>example:</strong>
             * <p>47.XX.XX.207</p>
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
     * {@link ModifyTunnelAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyTunnelAttributeResponseBody</p>
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
             * <p>The IPsec authentication algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * <p>The IPsec encryption algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * <p>The IPsec lifetime. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ipsecLifetime(Long ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * <p>The DH group.</p>
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
}
