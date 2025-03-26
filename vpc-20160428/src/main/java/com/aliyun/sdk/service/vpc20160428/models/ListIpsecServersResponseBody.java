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
 * {@link ListIpsecServersResponseBody} extends {@link TeaModel}
 *
 * <p>ListIpsecServersResponseBody</p>
 */
public class ListIpsecServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpsecServers")
    private java.util.List<IpsecServers> ipsecServers;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipsecServers
     */
    public java.util.List<IpsecServers> getIpsecServers() {
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
        private java.util.List<IpsecServers> ipsecServers; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListIpsecServersResponseBody model) {
            this.ipsecServers = model.ipsecServers;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of IPsec servers.</p>
         */
        public Builder ipsecServers(java.util.List<IpsecServers> ipsecServers) {
            this.ipsecServers = ipsecServers;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If no value is returned for <strong>NextToken</strong>, no next queries are sent.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54B48E3D-DF70-471B-AA93-08E683A1B457</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIpsecServersResponseBody build() {
            return new ListIpsecServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIpsecServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpsecServersResponseBody</p>
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
                this.remoteId = model.remoteId;
            } 

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
             * <p>The IKE negotiation mode. Valid values:</p>
             * <p><strong>main</strong>: This mode offers higher security during negotiations.</p>
             * 
             * <strong>example:</strong>
             * <p>main</p>
             */
            public Builder ikeMode(String ikeMode) {
                this.ikeMode = ikeMode;
                return this;
            }

            /**
             * <p>The Diffie-Hellman key exchange algorithm.</p>
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
             * <p>ikev2</p>
             */
            public Builder ikeVersion(String ikeVersion) {
                this.ikeVersion = ikeVersion;
                return this;
            }

            /**
             * <p>The ID of the IPsec server. The default value is the public IP address of the VPN gateway. Both FQDNs and IP addresses are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>116.64.XX.XX</p>
             */
            public Builder localId(String localId) {
                this.localId = localId;
                return this;
            }

            /**
             * <p>The identifier of the customer gateway. Both fully qualified domain names (FQDNs) and IP addresses are supported. By default, this parameter is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>139.67.XX.XX</p>
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
     * {@link ListIpsecServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpsecServersResponseBody</p>
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
             * <p>The Diffie-Hellman key exchange algorithm.</p>
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
     * {@link ListIpsecServersResponseBody} extends {@link TeaModel}
     *
     * <p>ListIpsecServersResponseBody</p>
     */
    public static class IpsecServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientIpPool")
        private String clientIpPool;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EffectImmediately")
        private Boolean effectImmediately;

        @com.aliyun.core.annotation.NameInMap("IDaaSInstanceId")
        private String iDaaSInstanceId;

        @com.aliyun.core.annotation.NameInMap("IkeConfig")
        private IkeConfig ikeConfig;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IpsecConfig")
        private IpsecConfig ipsecConfig;

        @com.aliyun.core.annotation.NameInMap("IpsecServerId")
        private String ipsecServerId;

        @com.aliyun.core.annotation.NameInMap("IpsecServerName")
        private String ipsecServerName;

        @com.aliyun.core.annotation.NameInMap("LocalSubnet")
        private String localSubnet;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("MultiFactorAuthEnabled")
        private Boolean multiFactorAuthEnabled;

        @com.aliyun.core.annotation.NameInMap("OnlineClientCount")
        private Integer onlineClientCount;

        @com.aliyun.core.annotation.NameInMap("Psk")
        private String psk;

        @com.aliyun.core.annotation.NameInMap("PskEnabled")
        private Boolean pskEnabled;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
        private String vpnGatewayId;

        private IpsecServers(Builder builder) {
            this.clientIpPool = builder.clientIpPool;
            this.creationTime = builder.creationTime;
            this.effectImmediately = builder.effectImmediately;
            this.iDaaSInstanceId = builder.iDaaSInstanceId;
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
            this.resourceGroupId = builder.resourceGroupId;
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
         * @return iDaaSInstanceId
         */
        public String getIDaaSInstanceId() {
            return this.iDaaSInstanceId;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
            private String iDaaSInstanceId; 
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
            private String resourceGroupId; 
            private String vpnGatewayId; 

            private Builder() {
            } 

            private Builder(IpsecServers model) {
                this.clientIpPool = model.clientIpPool;
                this.creationTime = model.creationTime;
                this.effectImmediately = model.effectImmediately;
                this.iDaaSInstanceId = model.iDaaSInstanceId;
                this.ikeConfig = model.ikeConfig;
                this.internetIp = model.internetIp;
                this.ipsecConfig = model.ipsecConfig;
                this.ipsecServerId = model.ipsecServerId;
                this.ipsecServerName = model.ipsecServerName;
                this.localSubnet = model.localSubnet;
                this.maxConnections = model.maxConnections;
                this.multiFactorAuthEnabled = model.multiFactorAuthEnabled;
                this.onlineClientCount = model.onlineClientCount;
                this.psk = model.psk;
                this.pskEnabled = model.pskEnabled;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.vpnGatewayId = model.vpnGatewayId;
            } 

            /**
             * <p>The client CIDR block. It refers to the CIDR block that is allocated to the virtual interface of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>10.0.0.0/24</p>
             */
            public Builder clientIpPool(String clientIpPool) {
                this.clientIpPool = clientIpPool;
                return this;
            }

            /**
             * <p>The time when the IPsec server was created.</p>
             * <p>T is used as a delimiter. Z indicates that the time is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-12-03T10:11:55Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Indicates whether the current IPsec tunnel is deleted and negotiations are reinitiated. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: immediately initiates negotiations after the configuration is completed.</li>
             * <li><strong>false</strong>: initiates negotiations when inbound traffic is detected.</li>
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
             * <p>The ID of the IDaaS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas-cn-hangzhou-****</p>
             */
            public Builder iDaaSInstanceId(String iDaaSInstanceId) {
                this.iDaaSInstanceId = iDaaSInstanceId;
                return this;
            }

            /**
             * <p>The configurations of Phase 1 negotiations.</p>
             */
            public Builder ikeConfig(IkeConfig ikeConfig) {
                this.ikeConfig = ikeConfig;
                return this;
            }

            /**
             * <p>The public IP address of the VPN gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>47.22.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
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
             * <p>The IPsec server ID.</p>
             * 
             * <strong>example:</strong>
             * <p>iss-bp1bo3xuvcxo7ixll****</p>
             */
            public Builder ipsecServerId(String ipsecServerId) {
                this.ipsecServerId = ipsecServerId;
                return this;
            }

            /**
             * <p>The name of the IPsec server.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ipsecServerName(String ipsecServerName) {
                this.ipsecServerName = ipsecServerName;
                return this;
            }

            /**
             * <p>The local CIDR blocks, which refer to the CIDR blocks on the virtual private cloud (VPC) side.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16,172.17.0.0/16</p>
             */
            public Builder localSubnet(String localSubnet) {
                this.localSubnet = localSubnet;
                return this;
            }

            /**
             * <p>The number of SSL-VPN connections supported by the VPN gateway.</p>
             * <blockquote>
             * <p> The number of SSL-VPN connections specified in this parameter includes both SSL-VPN and IPsec-VPN connections. For example, you have five SSL-VPN connections and three SSL clients occupy three SSL-VPN connections. In this case, two clients can connect to the IPsec server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>Indicates whether two-factor authentication is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong>: The feature is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder multiFactorAuthEnabled(Boolean multiFactorAuthEnabled) {
                this.multiFactorAuthEnabled = multiFactorAuthEnabled;
                return this;
            }

            /**
             * <p>The number of clients that are connected to the IPsec server.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder onlineClientCount(Integer onlineClientCount) {
                this.onlineClientCount = onlineClientCount;
                return this;
            }

            /**
             * <p>The pre-shared key.</p>
             * 
             * <strong>example:</strong>
             * <p>pgw6dy7d****</p>
             */
            public Builder psk(String psk) {
                this.psk = psk;
                return this;
            }

            /**
             * <p>Indicates whether pre-shared key authentication is enabled. Only <strong>true</strong> may be returned, which indicates that pre-shared key authentication is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder pskEnabled(Boolean pskEnabled) {
                this.pskEnabled = pskEnabled;
                return this;
            }

            /**
             * <p>The ID of the region where the IPsec server is created.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the IPsec server belongs.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query the resource group information.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzs372yg****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the VPN gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>vpn-bp1q8bgx4xnkm2ogj****</p>
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
