// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpsecServersResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpsecServersResponseBody</p>
 */
public class ListIpsecServersResponseBody extends TeaModel {
    @NameInMap("IpsecServers")
    private java.util.List < IpsecServers> ipsecServers;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListIpsecServersResponseBody(Builder builder) {
        this.ipsecServers = builder.ipsecServers;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIpsecServersResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipsecServers
     */
    public java.util.List < IpsecServers> getIpsecServers() {
        return this.ipsecServers;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    public static final class Builder {
        private java.util.List < IpsecServers> ipsecServers; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * IpsecServers.
         */
        public Builder ipsecServers(java.util.List < IpsecServers> ipsecServers) {
            this.ipsecServers = ipsecServers;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public ListIpsecServersResponseBody build() {
            return new ListIpsecServersResponseBody(this);
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
    public static class IpsecServers extends TeaModel {
        @NameInMap("ClientIpPool")
        private String clientIpPool;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("EffectImmediately")
        private Boolean effectImmediately;

        @NameInMap("IDaaSInstanceId")
        private String IDaaSInstanceId;

        @NameInMap("IkeConfig")
        private IkeConfig ikeConfig;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IpsecConfig")
        private IpsecConfig ipsecConfig;

        @NameInMap("IpsecServerId")
        private String ipsecServerId;

        @NameInMap("IpsecServerName")
        private String ipsecServerName;

        @NameInMap("LocalSubnet")
        private String localSubnet;

        @NameInMap("MaxConnections")
        private Integer maxConnections;

        @NameInMap("MultiFactorAuthEnabled")
        private Boolean multiFactorAuthEnabled;

        @NameInMap("OnlineClientCount")
        private Integer onlineClientCount;

        @NameInMap("Psk")
        private String psk;

        @NameInMap("PskEnabled")
        private Boolean pskEnabled;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VpnGatewayId")
        private String vpnGatewayId;

        private IpsecServers(Builder builder) {
            this.clientIpPool = builder.clientIpPool;
            this.creationTime = builder.creationTime;
            this.effectImmediately = builder.effectImmediately;
            this.IDaaSInstanceId = builder.IDaaSInstanceId;
            this.ikeConfig = builder.ikeConfig;
            this.internetIp = builder.internetIp;
            this.ipsecConfig = builder.ipsecConfig;
            this.ipsecServerId = builder.ipsecServerId;
            this.ipsecServerName = builder.ipsecServerName;
            this.localSubnet = builder.localSubnet;
            this.maxConnections = builder.maxConnections;
            this.multiFactorAuthEnabled = builder.multiFactorAuthEnabled;
            this.onlineClientCount = builder.onlineClientCount;
            this.psk = builder.psk;
            this.pskEnabled = builder.pskEnabled;
            this.regionId = builder.regionId;
            this.vpnGatewayId = builder.vpnGatewayId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpsecServers create() {
            return builder().build();
        }

        /**
         * @return clientIpPool
         */
        public String getClientIpPool() {
            return this.clientIpPool;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return effectImmediately
         */
        public Boolean getEffectImmediately() {
            return this.effectImmediately;
        }

        /**
         * @return IDaaSInstanceId
         */
        public String getIDaaSInstanceId() {
            return this.IDaaSInstanceId;
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
         * @return ipsecServerId
         */
        public String getIpsecServerId() {
            return this.ipsecServerId;
        }

        /**
         * @return ipsecServerName
         */
        public String getIpsecServerName() {
            return this.ipsecServerName;
        }

        /**
         * @return localSubnet
         */
        public String getLocalSubnet() {
            return this.localSubnet;
        }

        /**
         * @return maxConnections
         */
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return multiFactorAuthEnabled
         */
        public Boolean getMultiFactorAuthEnabled() {
            return this.multiFactorAuthEnabled;
        }

        /**
         * @return onlineClientCount
         */
        public Integer getOnlineClientCount() {
            return this.onlineClientCount;
        }

        /**
         * @return psk
         */
        public String getPsk() {
            return this.psk;
        }

        /**
         * @return pskEnabled
         */
        public Boolean getPskEnabled() {
            return this.pskEnabled;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vpnGatewayId
         */
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

        public static final class Builder {
            private String clientIpPool; 
            private String creationTime; 
            private Boolean effectImmediately; 
            private String IDaaSInstanceId; 
            private IkeConfig ikeConfig; 
            private String internetIp; 
            private IpsecConfig ipsecConfig; 
            private String ipsecServerId; 
            private String ipsecServerName; 
            private String localSubnet; 
            private Integer maxConnections; 
            private Boolean multiFactorAuthEnabled; 
            private Integer onlineClientCount; 
            private String psk; 
            private Boolean pskEnabled; 
            private String regionId; 
            private String vpnGatewayId; 

            /**
             * ClientIpPool.
             */
            public Builder clientIpPool(String clientIpPool) {
                this.clientIpPool = clientIpPool;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * IDaaSInstanceId.
             */
            public Builder IDaaSInstanceId(String IDaaSInstanceId) {
                this.IDaaSInstanceId = IDaaSInstanceId;
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
             * IpsecServerId.
             */
            public Builder ipsecServerId(String ipsecServerId) {
                this.ipsecServerId = ipsecServerId;
                return this;
            }

            /**
             * IpsecServerName.
             */
            public Builder ipsecServerName(String ipsecServerName) {
                this.ipsecServerName = ipsecServerName;
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
             * MaxConnections.
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * MultiFactorAuthEnabled.
             */
            public Builder multiFactorAuthEnabled(Boolean multiFactorAuthEnabled) {
                this.multiFactorAuthEnabled = multiFactorAuthEnabled;
                return this;
            }

            /**
             * OnlineClientCount.
             */
            public Builder onlineClientCount(Integer onlineClientCount) {
                this.onlineClientCount = onlineClientCount;
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
             * PskEnabled.
             */
            public Builder pskEnabled(Boolean pskEnabled) {
                this.pskEnabled = pskEnabled;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * VpnGatewayId.
             */
            public Builder vpnGatewayId(String vpnGatewayId) {
                this.vpnGatewayId = vpnGatewayId;
                return this;
            }

            public IpsecServers build() {
                return new IpsecServers(this);
            } 

        } 

    }
}
