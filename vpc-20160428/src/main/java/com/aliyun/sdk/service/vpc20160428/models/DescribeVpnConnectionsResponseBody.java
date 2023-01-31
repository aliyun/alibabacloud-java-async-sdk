// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnConnectionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpnConnectionsResponseBody</p>
 */
public class DescribeVpnConnectionsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VpnConnections")
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

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
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

        @NameInMap("Status")
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
    public static class VpnBgpConfig extends TeaModel {
        @NameInMap("AuthKey")
        private String authKey;

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
    public static class VpnConnection extends TeaModel {
        @NameInMap("AttachInstanceId")
        private String attachInstanceId;

        @NameInMap("AttachType")
        private String attachType;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CrossAccountAuthorized")
        private Boolean crossAccountAuthorized;

        @NameInMap("CustomerGatewayId")
        private String customerGatewayId;

        @NameInMap("EffectImmediately")
        private Boolean effectImmediately;

        @NameInMap("EnableDpd")
        private Boolean enableDpd;

        @NameInMap("EnableNatTraversal")
        private Boolean enableNatTraversal;

        @NameInMap("IkeConfig")
        private IkeConfig ikeConfig;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IpsecConfig")
        private IpsecConfig ipsecConfig;

        @NameInMap("LocalSubnet")
        private String localSubnet;

        @NameInMap("Name")
        private String name;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("RemoteCaCertificate")
        private String remoteCaCertificate;

        @NameInMap("RemoteSubnet")
        private String remoteSubnet;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("State")
        private String state;

        @NameInMap("Status")
        private String status;

        @NameInMap("TransitRouterId")
        private String transitRouterId;

        @NameInMap("TransitRouterName")
        private String transitRouterName;

        @NameInMap("VcoHealthCheck")
        private VcoHealthCheck vcoHealthCheck;

        @NameInMap("VpnBgpConfig")
        private VpnBgpConfig vpnBgpConfig;

        @NameInMap("VpnConnectionId")
        private String vpnConnectionId;

        @NameInMap("VpnGatewayId")
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
            this.ikeConfig = builder.ikeConfig;
            this.internetIp = builder.internetIp;
            this.ipsecConfig = builder.ipsecConfig;
            this.localSubnet = builder.localSubnet;
            this.name = builder.name;
            this.networkType = builder.networkType;
            this.remoteCaCertificate = builder.remoteCaCertificate;
            this.remoteSubnet = builder.remoteSubnet;
            this.spec = builder.spec;
            this.state = builder.state;
            this.status = builder.status;
            this.transitRouterId = builder.transitRouterId;
            this.transitRouterName = builder.transitRouterName;
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
            private IkeConfig ikeConfig; 
            private String internetIp; 
            private IpsecConfig ipsecConfig; 
            private String localSubnet; 
            private String name; 
            private String networkType; 
            private String remoteCaCertificate; 
            private String remoteSubnet; 
            private String spec; 
            private String state; 
            private String status; 
            private String transitRouterId; 
            private String transitRouterName; 
            private VcoHealthCheck vcoHealthCheck; 
            private VpnBgpConfig vpnBgpConfig; 
            private String vpnConnectionId; 
            private String vpnGatewayId; 

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
    public static class VpnConnections extends TeaModel {
        @NameInMap("VpnConnection")
        private java.util.List < VpnConnection> vpnConnection;

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
        public java.util.List < VpnConnection> getVpnConnection() {
            return this.vpnConnection;
        }

        public static final class Builder {
            private java.util.List < VpnConnection> vpnConnection; 

            /**
             * VpnConnection.
             */
            public Builder vpnConnection(java.util.List < VpnConnection> vpnConnection) {
                this.vpnConnection = vpnConnection;
                return this;
            }

            public VpnConnections build() {
                return new VpnConnections(this);
            } 

        } 

    }
}
