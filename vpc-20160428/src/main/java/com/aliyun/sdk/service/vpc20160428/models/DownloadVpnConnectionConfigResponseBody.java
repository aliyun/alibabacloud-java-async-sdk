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
 * {@link DownloadVpnConnectionConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadVpnConnectionConfigResponseBody</p>
 */
public class DownloadVpnConnectionConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpnConnectionConfig")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DownloadVpnConnectionConfigResponseBody model) {
            this.requestId = model.requestId;
            this.vpnConnectionConfig = model.vpnConnectionConfig;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0C68048B-0F70-40DA-B8AE-1B79B5CF62E3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurations of the peer gateway device.</p>
         */
        public Builder vpnConnectionConfig(VpnConnectionConfig vpnConnectionConfig) {
            this.vpnConnectionConfig = vpnConnectionConfig;
            return this;
        }

        public DownloadVpnConnectionConfigResponseBody build() {
            return new DownloadVpnConnectionConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DownloadVpnConnectionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadVpnConnectionConfigResponseBody</p>
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

            private Builder() {
            } 

            private Builder(IkeConfig model) {
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
             * <p>The authentication algorithm in the IKE phase.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm in the IKE phase.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * <p>The lifetime in the IKE phase. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ikeLifetime(Long ikeLifetime) {
                this.ikeLifetime = ikeLifetime;
                return this;
            }

            /**
             * <p>The IKE negotiation mode. Valid values:</p>
             * <ul>
             * <li><strong>main</strong>: This mode offers higher security during negotiations.</li>
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
             * <p>The DH group in the IKE phase.</p>
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
             * 
             * <strong>example:</strong>
             * <p>ikev1</p>
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * <p>The identifier of the customer gateway. FQDN and IP formats are supported. The default value is the IP address of the customer gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>116.62.XX.XX</p>
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * <p>The pre-shared key.</p>
             * 
             * <strong>example:</strong>
             * <p>pgw6dy7d1i8i****</p>
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * <p>The identifier of the VPN gateway. FQDN and IP formats are supported. The default value is the IP address of the VPN gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>139.196.XX.XX</p>
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
     * {@link DownloadVpnConnectionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadVpnConnectionConfigResponseBody</p>
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

            private Builder() {
            } 

            private Builder(IpsecConfig model) {
                this.ipsecAuthAlg = model.ipsecAuthAlg;
                this.ipsecEncAlg = model.ipsecEncAlg;
                this.ipsecLifetime = model.ipsecLifetime;
                this.ipsecPfs = model.ipsecPfs;
            } 

            /**
             * <p>The authentication algorithm in the IPsec phase.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm in the IPsec phase.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * <p>The lifetime in the IPsec phase. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ipsecLifetime(Long ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * <p>The DH group in the IPsec phase.</p>
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
     * {@link DownloadVpnConnectionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadVpnConnectionConfigResponseBody</p>
     */
    public static class TunnelConfigIkeConfig extends TeaModel {
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

            private Builder() {
            } 

            private Builder(TunnelConfigIkeConfig model) {
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
             * <p>The authentication algorithm in the IKE phase.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ikeAuthAlg(String ikeAuthAlg) {
                this.ikeAuthAlg = ikeAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm in the IKE phase.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ikeEncAlg(String ikeEncAlg) {
                this.ikeEncAlg = ikeEncAlg;
                return this;
            }

            /**
             * <p>The lifetime in the IKE phase. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ikeLifetime(Long ikeLifetime) {
                this.ikeLifetime = ikeLifetime;
                return this;
            }

            /**
             * <p>The IKE negotiation mode. Valid values:</p>
             * <ul>
             * <li><strong>main</strong>: This mode offers higher security during negotiations.</li>
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
             * <p>The DH group in the IKE phase.</p>
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
             * 
             * <strong>example:</strong>
             * <p>ikev1</p>
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * <p>The identifier of the tunnel on the data center side.</p>
             * 
             * <strong>example:</strong>
             * <p>47.21.XX.XX</p>
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * <p>The pre-shared key.</p>
             * 
             * <strong>example:</strong>
             * <p>pgw6dy7d1i8i****</p>
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * <p>The identifier of the tunnel on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>47.24.XX.XX</p>
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
    /**
     * 
     * {@link DownloadVpnConnectionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadVpnConnectionConfigResponseBody</p>
     */
    public static class TunnelConfigIpsecConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpsecAuthAlg")
        private String ipsecAuthAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecEncAlg")
        private String ipsecEncAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecLifetime")
        private Long ipsecLifetime;

        @com.aliyun.core.annotation.NameInMap("IpsecPfs")
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

            private Builder() {
            } 

            private Builder(TunnelConfigIpsecConfig model) {
                this.ipsecAuthAlg = model.ipsecAuthAlg;
                this.ipsecEncAlg = model.ipsecEncAlg;
                this.ipsecLifetime = model.ipsecLifetime;
                this.ipsecPfs = model.ipsecPfs;
            } 

            /**
             * <p>The authentication algorithm in the IPsec phase.</p>
             * 
             * <strong>example:</strong>
             * <p>sha1</p>
             */
            public Builder ipsecAuthAlg(String ipsecAuthAlg) {
                this.ipsecAuthAlg = ipsecAuthAlg;
                return this;
            }

            /**
             * <p>The encryption algorithm in the IPsec phase.</p>
             * 
             * <strong>example:</strong>
             * <p>aes</p>
             */
            public Builder ipsecEncAlg(String ipsecEncAlg) {
                this.ipsecEncAlg = ipsecEncAlg;
                return this;
            }

            /**
             * <p>The lifetime in the IPsec phase. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder ipsecLifetime(Long ipsecLifetime) {
                this.ipsecLifetime = ipsecLifetime;
                return this;
            }

            /**
             * <p>The DH group in the IPsec phase.</p>
             * 
             * <strong>example:</strong>
             * <p>group2</p>
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
    /**
     * 
     * {@link DownloadVpnConnectionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadVpnConnectionConfigResponseBody</p>
     */
    public static class TunnelConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IkeConfig")
        private TunnelConfigIkeConfig ikeConfig;

        @com.aliyun.core.annotation.NameInMap("IpsecConfig")
        private TunnelConfigIpsecConfig ipsecConfig;

        @com.aliyun.core.annotation.NameInMap("Local")
        private String local;

        @com.aliyun.core.annotation.NameInMap("Remote")
        private String remote;

        @com.aliyun.core.annotation.NameInMap("TunnelId")
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

            private Builder() {
            } 

            private Builder(TunnelConfig model) {
                this.ikeConfig = model.ikeConfig;
                this.ipsecConfig = model.ipsecConfig;
                this.local = model.local;
                this.remote = model.remote;
                this.tunnelId = model.tunnelId;
            } 

            /**
             * <p>The configurations of Phase 1 negotiations.</p>
             */
            public Builder ikeConfig(TunnelConfigIkeConfig ikeConfig) {
                this.ikeConfig = ikeConfig;
                return this;
            }

            /**
             * <p>The configurations of Phase 2 negotiations.</p>
             */
            public Builder ipsecConfig(TunnelConfigIpsecConfig ipsecConfig) {
                this.ipsecConfig = ipsecConfig;
                return this;
            }

            /**
             * <p>The identifier of the tunnel on the data center side.</p>
             * 
             * <strong>example:</strong>
             * <p>47.21.XX.XX</p>
             */
            public Builder local(String local) {
                this.local = local;
                return this;
            }

            /**
             * <p>The identifier of the tunnel on the Alibaba Cloud side.</p>
             * 
             * <strong>example:</strong>
             * <p>47.24.XX.XX</p>
             */
            public Builder remote(String remote) {
                this.remote = remote;
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

            public TunnelConfig build() {
                return new TunnelConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DownloadVpnConnectionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadVpnConnectionConfigResponseBody</p>
     */
    public static class TunnelsConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TunnelConfig")
        private java.util.List<TunnelConfig> tunnelConfig;

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
        public java.util.List<TunnelConfig> getTunnelConfig() {
            return this.tunnelConfig;
        }

        public static final class Builder {
            private java.util.List<TunnelConfig> tunnelConfig; 

            private Builder() {
            } 

            private Builder(TunnelsConfig model) {
                this.tunnelConfig = model.tunnelConfig;
            } 

            /**
             * TunnelConfig.
             */
            public Builder tunnelConfig(java.util.List<TunnelConfig> tunnelConfig) {
                this.tunnelConfig = tunnelConfig;
                return this;
            }

            public TunnelsConfig build() {
                return new TunnelsConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DownloadVpnConnectionConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadVpnConnectionConfigResponseBody</p>
     */
    public static class VpnConnectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IkeConfig")
        private IkeConfig ikeConfig;

        @com.aliyun.core.annotation.NameInMap("IpsecConfig")
        private IpsecConfig ipsecConfig;

        @com.aliyun.core.annotation.NameInMap("Local")
        private String local;

        @com.aliyun.core.annotation.NameInMap("LocalSubnet")
        private String localSubnet;

        @com.aliyun.core.annotation.NameInMap("Remote")
        private String remote;

        @com.aliyun.core.annotation.NameInMap("RemoteSubnet")
        private String remoteSubnet;

        @com.aliyun.core.annotation.NameInMap("TunnelsConfig")
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

            private Builder() {
            } 

            private Builder(VpnConnectionConfig model) {
                this.ikeConfig = model.ikeConfig;
                this.ipsecConfig = model.ipsecConfig;
                this.local = model.local;
                this.localSubnet = model.localSubnet;
                this.remote = model.remote;
                this.remoteSubnet = model.remoteSubnet;
                this.tunnelsConfig = model.tunnelsConfig;
            } 

            /**
             * <p>The configurations of Phase 1 negotiations.</p>
             */
            public Builder ikeConfig(IkeConfig ikeConfig) {
                this.ikeConfig = ikeConfig;
                return this;
            }

            /**
             * <p>The configurations of Phase 2 negotiations.</p>
             */
            public Builder ipsecConfig(IpsecConfig ipsecConfig) {
                this.ipsecConfig = ipsecConfig;
                return this;
            }

            /**
             * <p>The identifier of the customer gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>139.196.XX.XX</p>
             */
            public Builder local(String local) {
                this.local = local;
                return this;
            }

            /**
             * <p>The CIDR block on the data center side.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/8</p>
             */
            public Builder localSubnet(String localSubnet) {
                this.localSubnet = localSubnet;
                return this;
            }

            /**
             * <p>The identifier of the VPN gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>116.62.XX.XX</p>
             */
            public Builder remote(String remote) {
                this.remote = remote;
                return this;
            }

            /**
             * <p>The CIDR block on the virtual private cloud (VPC) side.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder remoteSubnet(String remoteSubnet) {
                this.remoteSubnet = remoteSubnet;
                return this;
            }

            /**
             * <p>The tunnel configurations of the peer gateway device.</p>
             * <p>The parameters in <strong>TunnelsConfig</strong> are returned only when the IPsec-VPN connection supports the dual-tunnel mode.</p>
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
