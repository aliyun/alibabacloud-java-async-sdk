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
 * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnConnectionsResponseBody</p>
 */
public class DescribeVpnConnectionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VpnConnections")
    private VpnConnections vpnConnections;

    private DescribeVpnConnectionsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpnConnections = builder.vpnConnections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpnConnectionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpnConnections
     */
    public VpnConnections getVpnConnections() {
        return this.vpnConnections;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private VpnConnections vpnConnections; 

        private Builder() {
        } 

        private Builder(DescribeVpnConnectionsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vpnConnections = model.vpnConnections;
        } 

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>238752DC-0693-49BE-9C85-711D5691D3E5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VpnConnections.
         */
        public Builder vpnConnections(VpnConnections vpnConnections) {
            this.vpnConnections = vpnConnections;
            return this;
        }

        public DescribeVpnConnectionsResponseBody build() {
            return new DescribeVpnConnectionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionsResponseBody</p>
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

            public IkeConfig build() {
                return new IkeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionsResponseBody</p>
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

            public IpsecConfig build() {
                return new IpsecConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionsResponseBody</p>
     */
    public static class VpnConnectionTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private VpnConnectionTag(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnConnectionTag create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(VpnConnectionTag model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public VpnConnectionTag build() {
                return new VpnConnectionTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionsResponseBody</p>
     */
    public static class TunnelBgpConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BgpStatus")
        private String bgpStatus;

        @com.aliyun.core.annotation.NameInMap("LocalAsn")
        private String localAsn;

        @com.aliyun.core.annotation.NameInMap("LocalBgpIp")
        private String localBgpIp;

        @com.aliyun.core.annotation.NameInMap("PeerAsn")
        private String peerAsn;

        @com.aliyun.core.annotation.NameInMap("PeerBgpIp")
        private String peerBgpIp;

        @com.aliyun.core.annotation.NameInMap("TunnelCidr")
        private String tunnelCidr;

        private TunnelBgpConfig(Builder builder) {
            this.bgpStatus = builder.bgpStatus;
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
         * @return bgpStatus
         */
        public String getBgpStatus() {
            return this.bgpStatus;
        }

        /**
         * @return localAsn
         */
        public String getLocalAsn() {
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
        public String getPeerAsn() {
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
            private String bgpStatus; 
            private String localAsn; 
            private String localBgpIp; 
            private String peerAsn; 
            private String peerBgpIp; 
            private String tunnelCidr; 

            private Builder() {
            } 

            private Builder(TunnelBgpConfig model) {
                this.bgpStatus = model.bgpStatus;
                this.localAsn = model.localAsn;
                this.localBgpIp = model.localBgpIp;
                this.peerAsn = model.peerAsn;
                this.peerBgpIp = model.peerBgpIp;
                this.tunnelCidr = model.tunnelCidr;
            } 

            /**
             * BgpStatus.
             */
            public Builder bgpStatus(String bgpStatus) {
                this.bgpStatus = bgpStatus;
                return this;
            }

            /**
             * LocalAsn.
             */
            public Builder localAsn(String localAsn) {
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
            public Builder peerAsn(String peerAsn) {
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
     * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionsResponseBody</p>
     */
    public static class TunnelIkeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IkeAuthAlg")
        private String ikeAuthAlg;

        @com.aliyun.core.annotation.NameInMap("IkeEncAlg")
        private String ikeEncAlg;

        @com.aliyun.core.annotation.NameInMap("IkeLifetime")
        private String ikeLifetime;

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
        public String getIkeLifetime() {
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
            private String ikeLifetime; 
            private String ikeMode; 
            private String ikePfs; 
            private String ikeVersion; 
            private String localId; 
            private String psk; 
            private String remoteId; 

            private Builder() {
            } 

            private Builder(TunnelIkeConfig model) {
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
            public Builder ikeLifetime(String ikeLifetime) {
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
    /**
     * 
     * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionsResponseBody</p>
     */
    public static class TunnelIpsecConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpsecAuthAlg")
        private String ipsecAuthAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecEncAlg")
        private String ipsecEncAlg;

        @com.aliyun.core.annotation.NameInMap("IpsecLifetime")
        private String ipsecLifetime;

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
        public String getIpsecLifetime() {
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
            private String ipsecLifetime; 
            private String ipsecPfs; 

            private Builder() {
            } 

            private Builder(TunnelIpsecConfig model) {
                this.ipsecAuthAlg = model.ipsecAuthAlg;
                this.ipsecEncAlg = model.ipsecEncAlg;
                this.ipsecLifetime = model.ipsecLifetime;
                this.ipsecPfs = model.ipsecPfs;
            } 

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
            public Builder ipsecLifetime(String ipsecLifetime) {
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
    /**
     * 
     * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionsResponseBody</p>
     */
    public static class TunnelOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerGatewayId")
        private String customerGatewayId;

        @com.aliyun.core.annotation.NameInMap("EnableDpd")
        private String enableDpd;

        @com.aliyun.core.annotation.NameInMap("EnableNatTraversal")
        private String enableNatTraversal;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("RemoteCaCertificate")
        private String remoteCaCertificate;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

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

        @com.aliyun.core.annotation.NameInMap("ZoneNo")
        private String zoneNo;

        private TunnelOptions(Builder builder) {
            this.customerGatewayId = builder.customerGatewayId;
            this.enableDpd = builder.enableDpd;
            this.enableNatTraversal = builder.enableNatTraversal;
            this.internetIp = builder.internetIp;
            this.remoteCaCertificate = builder.remoteCaCertificate;
            this.role = builder.role;
            this.state = builder.state;
            this.status = builder.status;
            this.tunnelBgpConfig = builder.tunnelBgpConfig;
            this.tunnelId = builder.tunnelId;
            this.tunnelIkeConfig = builder.tunnelIkeConfig;
            this.tunnelIndex = builder.tunnelIndex;
            this.tunnelIpsecConfig = builder.tunnelIpsecConfig;
            this.zoneNo = builder.zoneNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelOptions create() {
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
        public String getEnableDpd() {
            return this.enableDpd;
        }

        /**
         * @return enableNatTraversal
         */
        public String getEnableNatTraversal() {
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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

        /**
         * @return zoneNo
         */
        public String getZoneNo() {
            return this.zoneNo;
        }

        public static final class Builder {
            private String customerGatewayId; 
            private String enableDpd; 
            private String enableNatTraversal; 
            private String internetIp; 
            private String remoteCaCertificate; 
            private String role; 
            private String state; 
            private String status; 
            private TunnelBgpConfig tunnelBgpConfig; 
            private String tunnelId; 
            private TunnelIkeConfig tunnelIkeConfig; 
            private Integer tunnelIndex; 
            private TunnelIpsecConfig tunnelIpsecConfig; 
            private String zoneNo; 

            private Builder() {
            } 

            private Builder(TunnelOptions model) {
                this.customerGatewayId = model.customerGatewayId;
                this.enableDpd = model.enableDpd;
                this.enableNatTraversal = model.enableNatTraversal;
                this.internetIp = model.internetIp;
                this.remoteCaCertificate = model.remoteCaCertificate;
                this.role = model.role;
                this.state = model.state;
                this.status = model.status;
                this.tunnelBgpConfig = model.tunnelBgpConfig;
                this.tunnelId = model.tunnelId;
                this.tunnelIkeConfig = model.tunnelIkeConfig;
                this.tunnelIndex = model.tunnelIndex;
                this.tunnelIpsecConfig = model.tunnelIpsecConfig;
                this.zoneNo = model.zoneNo;
            } 

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
            public Builder enableDpd(String enableDpd) {
                this.enableDpd = enableDpd;
                return this;
            }

            /**
             * EnableNatTraversal.
             */
            public Builder enableNatTraversal(String enableNatTraversal) {
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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

            /**
             * ZoneNo.
             */
            public Builder zoneNo(String zoneNo) {
                this.zoneNo = zoneNo;
                return this;
            }

            public TunnelOptions build() {
                return new TunnelOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionsResponseBody</p>
     */
    public static class TunnelOptionsSpecification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TunnelOptions")
        private java.util.List<TunnelOptions> tunnelOptions;

        private TunnelOptionsSpecification(Builder builder) {
            this.tunnelOptions = builder.tunnelOptions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelOptionsSpecification create() {
            return builder().build();
        }

        /**
         * @return tunnelOptions
         */
        public java.util.List<TunnelOptions> getTunnelOptions() {
            return this.tunnelOptions;
        }

        public static final class Builder {
            private java.util.List<TunnelOptions> tunnelOptions; 

            private Builder() {
            } 

            private Builder(TunnelOptionsSpecification model) {
                this.tunnelOptions = model.tunnelOptions;
            } 

            /**
             * TunnelOptions.
             */
            public Builder tunnelOptions(java.util.List<TunnelOptions> tunnelOptions) {
                this.tunnelOptions = tunnelOptions;
                return this;
            }

            public TunnelOptionsSpecification build() {
                return new TunnelOptionsSpecification(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionsResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private VcoHealthCheck(Builder builder) {
            this.dip = builder.dip;
            this.enable = builder.enable;
            this.interval = builder.interval;
            this.policy = builder.policy;
            this.retry = builder.retry;
            this.sip = builder.sip;
            this.status = builder.status;
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

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String dip; 
            private String enable; 
            private Integer interval; 
            private String policy; 
            private Integer retry; 
            private String sip; 
            private String status; 

            private Builder() {
            } 

            private Builder(VcoHealthCheck model) {
                this.dip = model.dip;
                this.enable = model.enable;
                this.interval = model.interval;
                this.policy = model.policy;
                this.retry = model.retry;
                this.sip = model.sip;
                this.status = model.status;
            } 

            /**
             * Dip.
             */
            public Builder dip(String dip) {
                this.dip = dip;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * Retry.
             */
            public Builder retry(Integer retry) {
                this.retry = retry;
                return this;
            }

            /**
             * Sip.
             */
            public Builder sip(String sip) {
                this.sip = sip;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public VcoHealthCheck build() {
                return new VcoHealthCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionsResponseBody</p>
     */
    public static class VpnBgpConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthKey")
        private String authKey;

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
            this.authKey = builder.authKey;
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
         * @return authKey
         */
        public String getAuthKey() {
            return this.authKey;
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
            private String authKey; 
            private Long localAsn; 
            private String localBgpIp; 
            private Long peerAsn; 
            private String peerBgpIp; 
            private String status; 
            private String tunnelCidr; 

            private Builder() {
            } 

            private Builder(VpnBgpConfig model) {
                this.authKey = model.authKey;
                this.localAsn = model.localAsn;
                this.localBgpIp = model.localBgpIp;
                this.peerAsn = model.peerAsn;
                this.peerBgpIp = model.peerBgpIp;
                this.status = model.status;
                this.tunnelCidr = model.tunnelCidr;
            } 

            /**
             * AuthKey.
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TunnelCidr.
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
    /**
     * 
     * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionsResponseBody</p>
     */
    public static class VpnConnection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachInstanceId")
        private String attachInstanceId;

        @com.aliyun.core.annotation.NameInMap("AttachType")
        private String attachType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CrossAccountAuthorized")
        private Boolean crossAccountAuthorized;

        @com.aliyun.core.annotation.NameInMap("CustomerGatewayId")
        private String customerGatewayId;

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

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IpsecConfig")
        private IpsecConfig ipsecConfig;

        @com.aliyun.core.annotation.NameInMap("LocalSubnet")
        private String localSubnet;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("RemoteCaCertificate")
        private String remoteCaCertificate;

        @com.aliyun.core.annotation.NameInMap("RemoteSubnet")
        private String remoteSubnet;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private VpnConnectionTag tag;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterName")
        private String transitRouterName;

        @com.aliyun.core.annotation.NameInMap("TunnelBandwidth")
        private String tunnelBandwidth;

        @com.aliyun.core.annotation.NameInMap("TunnelOptionsSpecification")
        private TunnelOptionsSpecification tunnelOptionsSpecification;

        @com.aliyun.core.annotation.NameInMap("VcoHealthCheck")
        private VcoHealthCheck vcoHealthCheck;

        @com.aliyun.core.annotation.NameInMap("VpnBgpConfig")
        private VpnBgpConfig vpnBgpConfig;

        @com.aliyun.core.annotation.NameInMap("VpnConnectionId")
        private String vpnConnectionId;

        @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
        private String vpnGatewayId;

        private VpnConnection(Builder builder) {
            this.attachInstanceId = builder.attachInstanceId;
            this.attachType = builder.attachType;
            this.createTime = builder.createTime;
            this.crossAccountAuthorized = builder.crossAccountAuthorized;
            this.customerGatewayId = builder.customerGatewayId;
            this.effectImmediately = builder.effectImmediately;
            this.enableDpd = builder.enableDpd;
            this.enableNatTraversal = builder.enableNatTraversal;
            this.enableTunnelsBgp = builder.enableTunnelsBgp;
            this.ikeConfig = builder.ikeConfig;
            this.internetIp = builder.internetIp;
            this.ipsecConfig = builder.ipsecConfig;
            this.localSubnet = builder.localSubnet;
            this.name = builder.name;
            this.networkType = builder.networkType;
            this.remoteCaCertificate = builder.remoteCaCertificate;
            this.remoteSubnet = builder.remoteSubnet;
            this.resourceGroupId = builder.resourceGroupId;
            this.spec = builder.spec;
            this.state = builder.state;
            this.status = builder.status;
            this.tag = builder.tag;
            this.transitRouterId = builder.transitRouterId;
            this.transitRouterName = builder.transitRouterName;
            this.tunnelBandwidth = builder.tunnelBandwidth;
            this.tunnelOptionsSpecification = builder.tunnelOptionsSpecification;
            this.vcoHealthCheck = builder.vcoHealthCheck;
            this.vpnBgpConfig = builder.vpnBgpConfig;
            this.vpnConnectionId = builder.vpnConnectionId;
            this.vpnGatewayId = builder.vpnGatewayId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnConnection create() {
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
         * @return crossAccountAuthorized
         */
        public Boolean getCrossAccountAuthorized() {
            return this.crossAccountAuthorized;
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
         * @return ikeConfig
         */
        public IkeConfig getIkeConfig() {
            return this.ikeConfig;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
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
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tag
         */
        public VpnConnectionTag getTag() {
            return this.tag;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        /**
         * @return transitRouterName
         */
        public String getTransitRouterName() {
            return this.transitRouterName;
        }

        /**
         * @return tunnelBandwidth
         */
        public String getTunnelBandwidth() {
            return this.tunnelBandwidth;
        }

        /**
         * @return tunnelOptionsSpecification
         */
        public TunnelOptionsSpecification getTunnelOptionsSpecification() {
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
            private Boolean crossAccountAuthorized; 
            private String customerGatewayId; 
            private Boolean effectImmediately; 
            private Boolean enableDpd; 
            private Boolean enableNatTraversal; 
            private Boolean enableTunnelsBgp; 
            private IkeConfig ikeConfig; 
            private String internetIp; 
            private IpsecConfig ipsecConfig; 
            private String localSubnet; 
            private String name; 
            private String networkType; 
            private String remoteCaCertificate; 
            private String remoteSubnet; 
            private String resourceGroupId; 
            private String spec; 
            private String state; 
            private String status; 
            private VpnConnectionTag tag; 
            private String transitRouterId; 
            private String transitRouterName; 
            private String tunnelBandwidth; 
            private TunnelOptionsSpecification tunnelOptionsSpecification; 
            private VcoHealthCheck vcoHealthCheck; 
            private VpnBgpConfig vpnBgpConfig; 
            private String vpnConnectionId; 
            private String vpnGatewayId; 

            private Builder() {
            } 

            private Builder(VpnConnection model) {
                this.attachInstanceId = model.attachInstanceId;
                this.attachType = model.attachType;
                this.createTime = model.createTime;
                this.crossAccountAuthorized = model.crossAccountAuthorized;
                this.customerGatewayId = model.customerGatewayId;
                this.effectImmediately = model.effectImmediately;
                this.enableDpd = model.enableDpd;
                this.enableNatTraversal = model.enableNatTraversal;
                this.enableTunnelsBgp = model.enableTunnelsBgp;
                this.ikeConfig = model.ikeConfig;
                this.internetIp = model.internetIp;
                this.ipsecConfig = model.ipsecConfig;
                this.localSubnet = model.localSubnet;
                this.name = model.name;
                this.networkType = model.networkType;
                this.remoteCaCertificate = model.remoteCaCertificate;
                this.remoteSubnet = model.remoteSubnet;
                this.resourceGroupId = model.resourceGroupId;
                this.spec = model.spec;
                this.state = model.state;
                this.status = model.status;
                this.tag = model.tag;
                this.transitRouterId = model.transitRouterId;
                this.transitRouterName = model.transitRouterName;
                this.tunnelBandwidth = model.tunnelBandwidth;
                this.tunnelOptionsSpecification = model.tunnelOptionsSpecification;
                this.vcoHealthCheck = model.vcoHealthCheck;
                this.vpnBgpConfig = model.vpnBgpConfig;
                this.vpnConnectionId = model.vpnConnectionId;
                this.vpnGatewayId = model.vpnGatewayId;
            } 

            /**
             * AttachInstanceId.
             */
            public Builder attachInstanceId(String attachInstanceId) {
                this.attachInstanceId = attachInstanceId;
                return this;
            }

            /**
             * AttachType.
             */
            public Builder attachType(String attachType) {
                this.attachType = attachType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CrossAccountAuthorized.
             */
            public Builder crossAccountAuthorized(Boolean crossAccountAuthorized) {
                this.crossAccountAuthorized = crossAccountAuthorized;
                return this;
            }

            /**
             * CustomerGatewayId.
             */
            public Builder customerGatewayId(String customerGatewayId) {
                this.customerGatewayId = customerGatewayId;
                return this;
            }

            /**
             * EffectImmediately.
             */
            public Builder effectImmediately(Boolean effectImmediately) {
                this.effectImmediately = effectImmediately;
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
             * EnableTunnelsBgp.
             */
            public Builder enableTunnelsBgp(Boolean enableTunnelsBgp) {
                this.enableTunnelsBgp = enableTunnelsBgp;
                return this;
            }

            /**
             * IkeConfig.
             */
            public Builder ikeConfig(IkeConfig ikeConfig) {
                this.ikeConfig = ikeConfig;
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
             * IpsecConfig.
             */
            public Builder ipsecConfig(IpsecConfig ipsecConfig) {
                this.ipsecConfig = ipsecConfig;
                return this;
            }

            /**
             * LocalSubnet.
             */
            public Builder localSubnet(String localSubnet) {
                this.localSubnet = localSubnet;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NetworkType.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
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
             * RemoteSubnet.
             */
            public Builder remoteSubnet(String remoteSubnet) {
                this.remoteSubnet = remoteSubnet;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tag.
             */
            public Builder tag(VpnConnectionTag tag) {
                this.tag = tag;
                return this;
            }

            /**
             * TransitRouterId.
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            /**
             * TransitRouterName.
             */
            public Builder transitRouterName(String transitRouterName) {
                this.transitRouterName = transitRouterName;
                return this;
            }

            /**
             * TunnelBandwidth.
             */
            public Builder tunnelBandwidth(String tunnelBandwidth) {
                this.tunnelBandwidth = tunnelBandwidth;
                return this;
            }

            /**
             * TunnelOptionsSpecification.
             */
            public Builder tunnelOptionsSpecification(TunnelOptionsSpecification tunnelOptionsSpecification) {
                this.tunnelOptionsSpecification = tunnelOptionsSpecification;
                return this;
            }

            /**
             * VcoHealthCheck.
             */
            public Builder vcoHealthCheck(VcoHealthCheck vcoHealthCheck) {
                this.vcoHealthCheck = vcoHealthCheck;
                return this;
            }

            /**
             * VpnBgpConfig.
             */
            public Builder vpnBgpConfig(VpnBgpConfig vpnBgpConfig) {
                this.vpnBgpConfig = vpnBgpConfig;
                return this;
            }

            /**
             * VpnConnectionId.
             */
            public Builder vpnConnectionId(String vpnConnectionId) {
                this.vpnConnectionId = vpnConnectionId;
                return this;
            }

            /**
             * VpnGatewayId.
             */
            public Builder vpnGatewayId(String vpnGatewayId) {
                this.vpnGatewayId = vpnGatewayId;
                return this;
            }

            public VpnConnection build() {
                return new VpnConnection(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpnConnectionsResponseBody</p>
     */
    public static class VpnConnections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpnConnection")
        private java.util.List<VpnConnection> vpnConnection;

        private VpnConnections(Builder builder) {
            this.vpnConnection = builder.vpnConnection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpnConnections create() {
            return builder().build();
        }

        /**
         * @return vpnConnection
         */
        public java.util.List<VpnConnection> getVpnConnection() {
            return this.vpnConnection;
        }

        public static final class Builder {
            private java.util.List<VpnConnection> vpnConnection; 

            private Builder() {
            } 

            private Builder(VpnConnections model) {
                this.vpnConnection = model.vpnConnection;
            } 

            /**
             * VpnConnection.
             */
            public Builder vpnConnection(java.util.List<VpnConnection> vpnConnection) {
                this.vpnConnection = vpnConnection;
                return this;
            }

            public VpnConnections build() {
                return new VpnConnections(this);
            } 

        } 

    }
}
