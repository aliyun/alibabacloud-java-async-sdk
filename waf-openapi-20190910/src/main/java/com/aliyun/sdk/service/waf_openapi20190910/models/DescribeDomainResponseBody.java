// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainResponseBody</p>
 */
public class DescribeDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Domain")
    private Domain domain;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainResponseBody(Builder builder) {
        this.domain = builder.domain;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return domain
     */
    public Domain getDomain() {
        return this.domain;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Domain domain; 
        private String requestId; 

        /**
         * Domain.
         */
        public Builder domain(Domain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainResponseBody build() {
            return new DescribeDomainResponseBody(this);
        } 

    } 

    public static class ProtocolPortConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List < Integer > ports;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private ProtocolPortConfigs(Builder builder) {
            this.ports = builder.ports;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtocolPortConfigs create() {
            return builder().build();
        }

        /**
         * @return ports
         */
        public java.util.List < Integer > getPorts() {
            return this.ports;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private java.util.List < Integer > ports; 
            private String protocol; 

            /**
             * Ports.
             */
            public Builder ports(java.util.List < Integer > ports) {
                this.ports = ports;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public ProtocolPortConfigs build() {
                return new ProtocolPortConfigs(this);
            } 

        } 

    }
    public static class CloudNativeInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloudNativeProductName")
        private String cloudNativeProductName;

        @com.aliyun.core.annotation.NameInMap("IPAddressList")
        private java.util.List < String > IPAddressList;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ProtocolPortConfigs")
        private java.util.List < ProtocolPortConfigs> protocolPortConfigs;

        @com.aliyun.core.annotation.NameInMap("RedirectionTypeName")
        private String redirectionTypeName;

        private CloudNativeInstances(Builder builder) {
            this.cloudNativeProductName = builder.cloudNativeProductName;
            this.IPAddressList = builder.IPAddressList;
            this.instanceId = builder.instanceId;
            this.protocolPortConfigs = builder.protocolPortConfigs;
            this.redirectionTypeName = builder.redirectionTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudNativeInstances create() {
            return builder().build();
        }

        /**
         * @return cloudNativeProductName
         */
        public String getCloudNativeProductName() {
            return this.cloudNativeProductName;
        }

        /**
         * @return IPAddressList
         */
        public java.util.List < String > getIPAddressList() {
            return this.IPAddressList;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return protocolPortConfigs
         */
        public java.util.List < ProtocolPortConfigs> getProtocolPortConfigs() {
            return this.protocolPortConfigs;
        }

        /**
         * @return redirectionTypeName
         */
        public String getRedirectionTypeName() {
            return this.redirectionTypeName;
        }

        public static final class Builder {
            private String cloudNativeProductName; 
            private java.util.List < String > IPAddressList; 
            private String instanceId; 
            private java.util.List < ProtocolPortConfigs> protocolPortConfigs; 
            private String redirectionTypeName; 

            /**
             * CloudNativeProductName.
             */
            public Builder cloudNativeProductName(String cloudNativeProductName) {
                this.cloudNativeProductName = cloudNativeProductName;
                return this;
            }

            /**
             * IPAddressList.
             */
            public Builder IPAddressList(java.util.List < String > IPAddressList) {
                this.IPAddressList = IPAddressList;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ProtocolPortConfigs.
             */
            public Builder protocolPortConfigs(java.util.List < ProtocolPortConfigs> protocolPortConfigs) {
                this.protocolPortConfigs = protocolPortConfigs;
                return this;
            }

            /**
             * RedirectionTypeName.
             */
            public Builder redirectionTypeName(String redirectionTypeName) {
                this.redirectionTypeName = redirectionTypeName;
                return this;
            }

            public CloudNativeInstances build() {
                return new CloudNativeInstances(this);
            } 

        } 

    }
    public static class LogHeaders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("k")
        private String k;

        @com.aliyun.core.annotation.NameInMap("v")
        private String v;

        private LogHeaders(Builder builder) {
            this.k = builder.k;
            this.v = builder.v;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogHeaders create() {
            return builder().build();
        }

        /**
         * @return k
         */
        public String getK() {
            return this.k;
        }

        /**
         * @return v
         */
        public String getV() {
            return this.v;
        }

        public static final class Builder {
            private String k; 
            private String v; 

            /**
             * k.
             */
            public Builder k(String k) {
                this.k = k;
                return this;
            }

            /**
             * v.
             */
            public Builder v(String v) {
                this.v = v;
                return this;
            }

            public LogHeaders build() {
                return new LogHeaders(this);
            } 

        } 

    }
    public static class Domain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessHeaderMode")
        private Integer accessHeaderMode;

        @com.aliyun.core.annotation.NameInMap("AccessHeaders")
        private java.util.List < String > accessHeaders;

        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("CloudNativeInstances")
        private java.util.List < CloudNativeInstances> cloudNativeInstances;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private Integer clusterType;

        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("ConnectionTime")
        private Integer connectionTime;

        @com.aliyun.core.annotation.NameInMap("Http2Port")
        private java.util.List < Integer > http2Port;

        @com.aliyun.core.annotation.NameInMap("HttpPort")
        private java.util.List < Integer > httpPort;

        @com.aliyun.core.annotation.NameInMap("HttpToUserIp")
        private Integer httpToUserIp;

        @com.aliyun.core.annotation.NameInMap("HttpsPort")
        private java.util.List < Integer > httpsPort;

        @com.aliyun.core.annotation.NameInMap("HttpsRedirect")
        private Integer httpsRedirect;

        @com.aliyun.core.annotation.NameInMap("IpFollowStatus")
        private Integer ipFollowStatus;

        @com.aliyun.core.annotation.NameInMap("IsAccessProduct")
        private Integer isAccessProduct;

        @com.aliyun.core.annotation.NameInMap("Keepalive")
        private Boolean keepalive;

        @com.aliyun.core.annotation.NameInMap("KeepaliveRequests")
        private Integer keepaliveRequests;

        @com.aliyun.core.annotation.NameInMap("KeepaliveTimeout")
        private Integer keepaliveTimeout;

        @com.aliyun.core.annotation.NameInMap("LoadBalancing")
        private Integer loadBalancing;

        @com.aliyun.core.annotation.NameInMap("LogHeaders")
        private java.util.List < LogHeaders> logHeaders;

        @com.aliyun.core.annotation.NameInMap("ReadTime")
        private Integer readTime;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Retry")
        private Boolean retry;

        @com.aliyun.core.annotation.NameInMap("SniHost")
        private String sniHost;

        @com.aliyun.core.annotation.NameInMap("SniStatus")
        private Integer sniStatus;

        @com.aliyun.core.annotation.NameInMap("SourceIps")
        private java.util.List < String > sourceIps;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        @com.aliyun.core.annotation.NameInMap("WriteTime")
        private Integer writeTime;

        private Domain(Builder builder) {
            this.accessHeaderMode = builder.accessHeaderMode;
            this.accessHeaders = builder.accessHeaders;
            this.accessType = builder.accessType;
            this.cloudNativeInstances = builder.cloudNativeInstances;
            this.clusterType = builder.clusterType;
            this.cname = builder.cname;
            this.connectionTime = builder.connectionTime;
            this.http2Port = builder.http2Port;
            this.httpPort = builder.httpPort;
            this.httpToUserIp = builder.httpToUserIp;
            this.httpsPort = builder.httpsPort;
            this.httpsRedirect = builder.httpsRedirect;
            this.ipFollowStatus = builder.ipFollowStatus;
            this.isAccessProduct = builder.isAccessProduct;
            this.keepalive = builder.keepalive;
            this.keepaliveRequests = builder.keepaliveRequests;
            this.keepaliveTimeout = builder.keepaliveTimeout;
            this.loadBalancing = builder.loadBalancing;
            this.logHeaders = builder.logHeaders;
            this.readTime = builder.readTime;
            this.resourceGroupId = builder.resourceGroupId;
            this.retry = builder.retry;
            this.sniHost = builder.sniHost;
            this.sniStatus = builder.sniStatus;
            this.sourceIps = builder.sourceIps;
            this.version = builder.version;
            this.writeTime = builder.writeTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Domain create() {
            return builder().build();
        }

        /**
         * @return accessHeaderMode
         */
        public Integer getAccessHeaderMode() {
            return this.accessHeaderMode;
        }

        /**
         * @return accessHeaders
         */
        public java.util.List < String > getAccessHeaders() {
            return this.accessHeaders;
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return cloudNativeInstances
         */
        public java.util.List < CloudNativeInstances> getCloudNativeInstances() {
            return this.cloudNativeInstances;
        }

        /**
         * @return clusterType
         */
        public Integer getClusterType() {
            return this.clusterType;
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return connectionTime
         */
        public Integer getConnectionTime() {
            return this.connectionTime;
        }

        /**
         * @return http2Port
         */
        public java.util.List < Integer > getHttp2Port() {
            return this.http2Port;
        }

        /**
         * @return httpPort
         */
        public java.util.List < Integer > getHttpPort() {
            return this.httpPort;
        }

        /**
         * @return httpToUserIp
         */
        public Integer getHttpToUserIp() {
            return this.httpToUserIp;
        }

        /**
         * @return httpsPort
         */
        public java.util.List < Integer > getHttpsPort() {
            return this.httpsPort;
        }

        /**
         * @return httpsRedirect
         */
        public Integer getHttpsRedirect() {
            return this.httpsRedirect;
        }

        /**
         * @return ipFollowStatus
         */
        public Integer getIpFollowStatus() {
            return this.ipFollowStatus;
        }

        /**
         * @return isAccessProduct
         */
        public Integer getIsAccessProduct() {
            return this.isAccessProduct;
        }

        /**
         * @return keepalive
         */
        public Boolean getKeepalive() {
            return this.keepalive;
        }

        /**
         * @return keepaliveRequests
         */
        public Integer getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        /**
         * @return keepaliveTimeout
         */
        public Integer getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        /**
         * @return loadBalancing
         */
        public Integer getLoadBalancing() {
            return this.loadBalancing;
        }

        /**
         * @return logHeaders
         */
        public java.util.List < LogHeaders> getLogHeaders() {
            return this.logHeaders;
        }

        /**
         * @return readTime
         */
        public Integer getReadTime() {
            return this.readTime;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return retry
         */
        public Boolean getRetry() {
            return this.retry;
        }

        /**
         * @return sniHost
         */
        public String getSniHost() {
            return this.sniHost;
        }

        /**
         * @return sniStatus
         */
        public Integer getSniStatus() {
            return this.sniStatus;
        }

        /**
         * @return sourceIps
         */
        public java.util.List < String > getSourceIps() {
            return this.sourceIps;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        /**
         * @return writeTime
         */
        public Integer getWriteTime() {
            return this.writeTime;
        }

        public static final class Builder {
            private Integer accessHeaderMode; 
            private java.util.List < String > accessHeaders; 
            private String accessType; 
            private java.util.List < CloudNativeInstances> cloudNativeInstances; 
            private Integer clusterType; 
            private String cname; 
            private Integer connectionTime; 
            private java.util.List < Integer > http2Port; 
            private java.util.List < Integer > httpPort; 
            private Integer httpToUserIp; 
            private java.util.List < Integer > httpsPort; 
            private Integer httpsRedirect; 
            private Integer ipFollowStatus; 
            private Integer isAccessProduct; 
            private Boolean keepalive; 
            private Integer keepaliveRequests; 
            private Integer keepaliveTimeout; 
            private Integer loadBalancing; 
            private java.util.List < LogHeaders> logHeaders; 
            private Integer readTime; 
            private String resourceGroupId; 
            private Boolean retry; 
            private String sniHost; 
            private Integer sniStatus; 
            private java.util.List < String > sourceIps; 
            private Long version; 
            private Integer writeTime; 

            /**
             * AccessHeaderMode.
             */
            public Builder accessHeaderMode(Integer accessHeaderMode) {
                this.accessHeaderMode = accessHeaderMode;
                return this;
            }

            /**
             * AccessHeaders.
             */
            public Builder accessHeaders(java.util.List < String > accessHeaders) {
                this.accessHeaders = accessHeaders;
                return this;
            }

            /**
             * AccessType.
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * CloudNativeInstances.
             */
            public Builder cloudNativeInstances(java.util.List < CloudNativeInstances> cloudNativeInstances) {
                this.cloudNativeInstances = cloudNativeInstances;
                return this;
            }

            /**
             * ClusterType.
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * Cname.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * ConnectionTime.
             */
            public Builder connectionTime(Integer connectionTime) {
                this.connectionTime = connectionTime;
                return this;
            }

            /**
             * Http2Port.
             */
            public Builder http2Port(java.util.List < Integer > http2Port) {
                this.http2Port = http2Port;
                return this;
            }

            /**
             * HttpPort.
             */
            public Builder httpPort(java.util.List < Integer > httpPort) {
                this.httpPort = httpPort;
                return this;
            }

            /**
             * HttpToUserIp.
             */
            public Builder httpToUserIp(Integer httpToUserIp) {
                this.httpToUserIp = httpToUserIp;
                return this;
            }

            /**
             * HttpsPort.
             */
            public Builder httpsPort(java.util.List < Integer > httpsPort) {
                this.httpsPort = httpsPort;
                return this;
            }

            /**
             * HttpsRedirect.
             */
            public Builder httpsRedirect(Integer httpsRedirect) {
                this.httpsRedirect = httpsRedirect;
                return this;
            }

            /**
             * IpFollowStatus.
             */
            public Builder ipFollowStatus(Integer ipFollowStatus) {
                this.ipFollowStatus = ipFollowStatus;
                return this;
            }

            /**
             * IsAccessProduct.
             */
            public Builder isAccessProduct(Integer isAccessProduct) {
                this.isAccessProduct = isAccessProduct;
                return this;
            }

            /**
             * Keepalive.
             */
            public Builder keepalive(Boolean keepalive) {
                this.keepalive = keepalive;
                return this;
            }

            /**
             * KeepaliveRequests.
             */
            public Builder keepaliveRequests(Integer keepaliveRequests) {
                this.keepaliveRequests = keepaliveRequests;
                return this;
            }

            /**
             * KeepaliveTimeout.
             */
            public Builder keepaliveTimeout(Integer keepaliveTimeout) {
                this.keepaliveTimeout = keepaliveTimeout;
                return this;
            }

            /**
             * LoadBalancing.
             */
            public Builder loadBalancing(Integer loadBalancing) {
                this.loadBalancing = loadBalancing;
                return this;
            }

            /**
             * LogHeaders.
             */
            public Builder logHeaders(java.util.List < LogHeaders> logHeaders) {
                this.logHeaders = logHeaders;
                return this;
            }

            /**
             * ReadTime.
             */
            public Builder readTime(Integer readTime) {
                this.readTime = readTime;
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
             * Retry.
             */
            public Builder retry(Boolean retry) {
                this.retry = retry;
                return this;
            }

            /**
             * SniHost.
             */
            public Builder sniHost(String sniHost) {
                this.sniHost = sniHost;
                return this;
            }

            /**
             * SniStatus.
             */
            public Builder sniStatus(Integer sniStatus) {
                this.sniStatus = sniStatus;
                return this;
            }

            /**
             * SourceIps.
             */
            public Builder sourceIps(java.util.List < String > sourceIps) {
                this.sourceIps = sourceIps;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            /**
             * WriteTime.
             */
            public Builder writeTime(Integer writeTime) {
                this.writeTime = writeTime;
                return this;
            }

            public Domain build() {
                return new Domain(this);
            } 

        } 

    }
}
