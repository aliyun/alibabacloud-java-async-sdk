// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSslVpnServersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSslVpnServersResponseBody</p>
 */
public class DescribeSslVpnServersResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SslVpnServers")
    private SslVpnServers sslVpnServers;

    @NameInMap("TotalCount")
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
         * SslVpnServers.
         */
        public Builder sslVpnServers(SslVpnServers sslVpnServers) {
            this.sslVpnServers = sslVpnServers;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSslVpnServersResponseBody build() {
            return new DescribeSslVpnServersResponseBody(this);
        } 

    } 

    public static class SslVpnServer extends TeaModel {
        @NameInMap("Cipher")
        private String cipher;

        @NameInMap("ClientIpPool")
        private String clientIpPool;

        @NameInMap("Compress")
        private Boolean compress;

        @NameInMap("Connections")
        private Integer connections;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("EnableMultiFactorAuth")
        private Boolean enableMultiFactorAuth;

        @NameInMap("IDaaSInstanceId")
        private String IDaaSInstanceId;

        @NameInMap("IDaaSRegionId")
        private String IDaaSRegionId;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("LocalSubnet")
        private String localSubnet;

        @NameInMap("MaxConnections")
        private Integer maxConnections;

        @NameInMap("Name")
        private String name;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Proto")
        private String proto;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SslVpnServerId")
        private String sslVpnServerId;

        @NameInMap("VpnGatewayId")
        private String vpnGatewayId;

        private SslVpnServer(Builder builder) {
            this.cipher = builder.cipher;
            this.clientIpPool = builder.clientIpPool;
            this.compress = builder.compress;
            this.connections = builder.connections;
            this.createTime = builder.createTime;
            this.enableMultiFactorAuth = builder.enableMultiFactorAuth;
            this.IDaaSInstanceId = builder.IDaaSInstanceId;
            this.IDaaSRegionId = builder.IDaaSRegionId;
            this.internetIp = builder.internetIp;
            this.localSubnet = builder.localSubnet;
            this.maxConnections = builder.maxConnections;
            this.name = builder.name;
            this.port = builder.port;
            this.proto = builder.proto;
            this.regionId = builder.regionId;
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
         * @return IDaaSInstanceId
         */
        public String getIDaaSInstanceId() {
            return this.IDaaSInstanceId;
        }

        /**
         * @return IDaaSRegionId
         */
        public String getIDaaSRegionId() {
            return this.IDaaSRegionId;
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
            private String IDaaSInstanceId; 
            private String IDaaSRegionId; 
            private String internetIp; 
            private String localSubnet; 
            private Integer maxConnections; 
            private String name; 
            private Integer port; 
            private String proto; 
            private String regionId; 
            private String sslVpnServerId; 
            private String vpnGatewayId; 

            /**
             * Cipher.
             */
            public Builder cipher(String cipher) {
                this.cipher = cipher;
                return this;
            }

            /**
             * ClientIpPool.
             */
            public Builder clientIpPool(String clientIpPool) {
                this.clientIpPool = clientIpPool;
                return this;
            }

            /**
             * Compress.
             */
            public Builder compress(Boolean compress) {
                this.compress = compress;
                return this;
            }

            /**
             * Connections.
             */
            public Builder connections(Integer connections) {
                this.connections = connections;
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
             * EnableMultiFactorAuth.
             */
            public Builder enableMultiFactorAuth(Boolean enableMultiFactorAuth) {
                this.enableMultiFactorAuth = enableMultiFactorAuth;
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
             * IDaaSRegionId.
             */
            public Builder IDaaSRegionId(String IDaaSRegionId) {
                this.IDaaSRegionId = IDaaSRegionId;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Proto.
             */
            public Builder proto(String proto) {
                this.proto = proto;
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
             * SslVpnServerId.
             */
            public Builder sslVpnServerId(String sslVpnServerId) {
                this.sslVpnServerId = sslVpnServerId;
                return this;
            }

            /**
             * VpnGatewayId.
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
    public static class SslVpnServers extends TeaModel {
        @NameInMap("SslVpnServer")
        private java.util.List < SslVpnServer> sslVpnServer;

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
        public java.util.List < SslVpnServer> getSslVpnServer() {
            return this.sslVpnServer;
        }

        public static final class Builder {
            private java.util.List < SslVpnServer> sslVpnServer; 

            /**
             * SslVpnServer.
             */
            public Builder sslVpnServer(java.util.List < SslVpnServer> sslVpnServer) {
                this.sslVpnServer = sslVpnServer;
                return this;
            }

            public SslVpnServers build() {
                return new SslVpnServers(this);
            } 

        } 

    }
}
