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
 * {@link DescribeSslVpnServersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSslVpnServersResponseBody</p>
 */
public class DescribeSslVpnServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SslVpnServers")
    private SslVpnServers sslVpnServers;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSslVpnServersResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sslVpnServers = builder.sslVpnServers;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSslVpnServersResponseBody create() {
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
     * @return sslVpnServers
     */
    public SslVpnServers getSslVpnServers() {
        return this.sslVpnServers;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private SslVpnServers sslVpnServers; 
        private Integer totalCount; 

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>D350187B-EA41-4577-950B-95434C8302E1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The detailed information about the SSL-VPN servers.</p>
         */
        public Builder sslVpnServers(SslVpnServers sslVpnServers) {
            this.sslVpnServers = sslVpnServers;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSslVpnServersResponseBody build() {
            return new DescribeSslVpnServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSslVpnServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSslVpnServersResponseBody</p>
     */
    public static class SslVpnServer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cipher")
        private String cipher;

        @com.aliyun.core.annotation.NameInMap("ClientIpPool")
        private String clientIpPool;

        @com.aliyun.core.annotation.NameInMap("Compress")
        private Boolean compress;

        @com.aliyun.core.annotation.NameInMap("Connections")
        private Integer connections;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EnableMultiFactorAuth")
        private Boolean enableMultiFactorAuth;

        @com.aliyun.core.annotation.NameInMap("IDaaSApplicationId")
        private String iDaaSApplicationId;

        @com.aliyun.core.annotation.NameInMap("IDaaSInstanceId")
        private String iDaaSInstanceId;

        @com.aliyun.core.annotation.NameInMap("IDaaSInstanceVersion")
        private String iDaaSInstanceVersion;

        @com.aliyun.core.annotation.NameInMap("IDaaSRegionId")
        private String iDaaSRegionId;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("LocalSubnet")
        private String localSubnet;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Proto")
        private String proto;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SslVpnServerId")
        private String sslVpnServerId;

        @com.aliyun.core.annotation.NameInMap("VpnGatewayId")
        private String vpnGatewayId;

        private SslVpnServer(Builder builder) {
            this.cipher = builder.cipher;
            this.clientIpPool = builder.clientIpPool;
            this.compress = builder.compress;
            this.connections = builder.connections;
            this.createTime = builder.createTime;
            this.enableMultiFactorAuth = builder.enableMultiFactorAuth;
            this.iDaaSApplicationId = builder.iDaaSApplicationId;
            this.iDaaSInstanceId = builder.iDaaSInstanceId;
            this.iDaaSInstanceVersion = builder.iDaaSInstanceVersion;
            this.iDaaSRegionId = builder.iDaaSRegionId;
            this.internetIp = builder.internetIp;
            this.localSubnet = builder.localSubnet;
            this.maxConnections = builder.maxConnections;
            this.name = builder.name;
            this.port = builder.port;
            this.proto = builder.proto;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.sslVpnServerId = builder.sslVpnServerId;
            this.vpnGatewayId = builder.vpnGatewayId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SslVpnServer create() {
            return builder().build();
        }

        /**
         * @return cipher
         */
        public String getCipher() {
            return this.cipher;
        }

        /**
         * @return clientIpPool
         */
        public String getClientIpPool() {
            return this.clientIpPool;
        }

        /**
         * @return compress
         */
        public Boolean getCompress() {
            return this.compress;
        }

        /**
         * @return connections
         */
        public Integer getConnections() {
            return this.connections;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enableMultiFactorAuth
         */
        public Boolean getEnableMultiFactorAuth() {
            return this.enableMultiFactorAuth;
        }

        /**
         * @return iDaaSApplicationId
         */
        public String getIDaaSApplicationId() {
            return this.iDaaSApplicationId;
        }

        /**
         * @return iDaaSInstanceId
         */
        public String getIDaaSInstanceId() {
            return this.iDaaSInstanceId;
        }

        /**
         * @return iDaaSInstanceVersion
         */
        public String getIDaaSInstanceVersion() {
            return this.iDaaSInstanceVersion;
        }

        /**
         * @return iDaaSRegionId
         */
        public String getIDaaSRegionId() {
            return this.iDaaSRegionId;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return proto
         */
        public String getProto() {
            return this.proto;
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
         * @return sslVpnServerId
         */
        public String getSslVpnServerId() {
            return this.sslVpnServerId;
        }

        /**
         * @return vpnGatewayId
         */
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

        public static final class Builder {
            private String cipher; 
            private String clientIpPool; 
            private Boolean compress; 
            private Integer connections; 
            private Long createTime; 
            private Boolean enableMultiFactorAuth; 
            private String iDaaSApplicationId; 
            private String iDaaSInstanceId; 
            private String iDaaSInstanceVersion; 
            private String iDaaSRegionId; 
            private String internetIp; 
            private String localSubnet; 
            private Integer maxConnections; 
            private String name; 
            private Integer port; 
            private String proto; 
            private String regionId; 
            private String resourceGroupId; 
            private String sslVpnServerId; 
            private String vpnGatewayId; 

            /**
             * <p>The encryption algorithm.</p>
             * 
             * <strong>example:</strong>
             * <p>AES-128-CBC</p>
             */
            public Builder cipher(String cipher) {
                this.cipher = cipher;
                return this;
            }

            /**
             * <p>The client CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.1.0/24</p>
             */
            public Builder clientIpPool(String clientIpPool) {
                this.clientIpPool = clientIpPool;
                return this;
            }

            /**
             * <p>Indicates whether data compression is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder compress(Boolean compress) {
                this.compress = compress;
                return this;
            }

            /**
             * <p>The total number of current connections.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder connections(Integer connections) {
                this.connections = connections;
                return this;
            }

            /**
             * <p>The timestamp generated when the SSL-VPN server was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1613800884000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether two-factor authentication is enabled.</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableMultiFactorAuth(Boolean enableMultiFactorAuth) {
                this.enableMultiFactorAuth = enableMultiFactorAuth;
                return this;
            }

            /**
             * <p>The ID of the IDaaS application.</p>
             * 
             * <strong>example:</strong>
             * <p>app_my6g4qmvnwxzj2f****</p>
             */
            public Builder iDaaSApplicationId(String iDaaSApplicationId) {
                this.iDaaSApplicationId = iDaaSApplicationId;
                return this;
            }

            /**
             * <p>The ID of the IDaaS EIAM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas-cn-hangzhou-****</p>
             */
            public Builder iDaaSInstanceId(String iDaaSInstanceId) {
                this.iDaaSInstanceId = iDaaSInstanceId;
                return this;
            }

            /**
             * <p>The version of the IDaaS EIAM instance.</p>
             * <ul>
             * <li>This parameter is returned only if the SSL server is associated with an IDaaS EIAM 2.0 instance. Only <strong>EIAM 2.0</strong> is returned.</li>
             * <li>If the SSL server is associated with an IDaaS EIAM 1.0 instance, no value is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EIAM 2.0</p>
             */
            public Builder iDaaSInstanceVersion(String iDaaSInstanceVersion) {
                this.iDaaSInstanceVersion = iDaaSInstanceVersion;
                return this;
            }

            /**
             * <p>The region ID of the IDaaS EIAM instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder iDaaSRegionId(String iDaaSRegionId) {
                this.iDaaSRegionId = iDaaSRegionId;
                return this;
            }

            /**
             * <p>The public IP address of the VPN gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>47.5.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The local CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/24</p>
             */
            public Builder localSubnet(String localSubnet) {
                this.localSubnet = localSubnet;
                return this;
            }

            /**
             * <p>The maximum number of connections.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The name of the SSL server.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The port that is used by the SSL-VPN server.</p>
             * 
             * <strong>example:</strong>
             * <p>1194</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol that is used by the SSL server.</p>
             * 
             * <strong>example:</strong>
             * <p>UDP</p>
             */
            public Builder proto(String proto) {
                this.proto = proto;
                return this;
            }

            /**
             * <p>The region ID of the SSL server.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The resource group ID of the SSL server.</p>
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
             * <p>The ID of the SSL server.</p>
             * 
             * <strong>example:</strong>
             * <p>vss-bp15j3du13gq1dgey****</p>
             */
            public Builder sslVpnServerId(String sslVpnServerId) {
                this.sslVpnServerId = sslVpnServerId;
                return this;
            }

            /**
             * <p>The ID of the VPN gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>vpn-bp1on0xae9d771ggi****</p>
             */
            public Builder vpnGatewayId(String vpnGatewayId) {
                this.vpnGatewayId = vpnGatewayId;
                return this;
            }

            public SslVpnServer build() {
                return new SslVpnServer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSslVpnServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSslVpnServersResponseBody</p>
     */
    public static class SslVpnServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SslVpnServer")
        private java.util.List<SslVpnServer> sslVpnServer;

        private SslVpnServers(Builder builder) {
            this.sslVpnServer = builder.sslVpnServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SslVpnServers create() {
            return builder().build();
        }

        /**
         * @return sslVpnServer
         */
        public java.util.List<SslVpnServer> getSslVpnServer() {
            return this.sslVpnServer;
        }

        public static final class Builder {
            private java.util.List<SslVpnServer> sslVpnServer; 

            /**
             * SslVpnServer.
             */
            public Builder sslVpnServer(java.util.List<SslVpnServer> sslVpnServer) {
                this.sslVpnServer = sslVpnServer;
                return this;
            }

            public SslVpnServers build() {
                return new SslVpnServers(this);
            } 

        } 

    }
}
